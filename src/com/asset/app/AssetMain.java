package com.asset.app;

import java.util.Date;
import java.util.Scanner;

import com.asset.bean.Asset;
import com.asset.exception.ActiveCheckoutExistsException;
import com.asset.exception.AssetNotAvailableException;
import com.asset.exception.ValidationException;
import com.asset.service.AssetService;

public class AssetMain {
	private static AssetService assetService;
	public static void main(String[] args) {
		assetService = new AssetService();
		Scanner sc = new Scanner(System.in);
		System.out.println("IT Asset Checkout & Return Console");
		try {
		Asset a = new Asset();
		a.setAsset_tag("LAPTOP-020");
		a.setCategory("LAPTOP");
		a.setModel("HP ProBook 440 G9");
		a.setSerialNo("HP-PR-010");
		a.setTotalQuantity(5);
		a.setAvailableQuantity(5);
		a.setStatus("ACTIVE");
		boolean r = assetService.addNewAsset(a);
		System.out.println(r ? "ASSET ADDED" : "ASSET ADD FAILED");
		} catch (ValidationException e) {
		System.out.println("Validation Error: " + e.toString());
		} catch (Exception e) {
		System.out.println("System Error: " + e.getMessage());
		}
		try {
		boolean r = assetService.checkoutAsset("LAPTOP-010", "EMP2001", new Date(), new Date());
		System.out.println(r ? "CHECKOUT SUCCESS" : "CHECKOUT FAILED");
		} catch (AssetNotAvailableException e) {
		System.out.println("Availability Error: " + e.toString());
		} catch (ValidationException e) {
		System.out.println("Validation Error: " + e.toString());
		} catch (Exception e) {
		System.out.println("System Error: " + e.getMessage());
		}
		try {
		boolean r = assetService.removeAsset("LAPTOP-010");
		System.out.println(r ? "ASSET REMOVED" : "ASSET REMOVAL FAILED");
		} catch (ActiveCheckoutExistsException e) {
		System.out.println("Removal Blocked: " + e.toString());
		} catch (ValidationException e) {
		System.out.println("Validation Error: " + e.toString());
		} catch (Exception e) {
		System.out.println("System Error: " + e.getMessage());
		}
		sc.close();
		}
		}