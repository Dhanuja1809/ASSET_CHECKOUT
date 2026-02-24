This project is an Asset Checkout Management System developed using Core Java (JSE-21).

It helps track assets and their checkout/return status within an organization.

The project uses a layered architecture, separating application logic, data handling, services, and custom exceptions.

The bean classes (Asset, Checkout) define the data models used to store asset details and checkout information.

The DAO layer (AssetDAO, CheckoutDAO) manages all data storage and retrieval operations.

The Service layer contains business logic such as validating checkout rules, updating asset status, and ensuring proper return flow.

Multiple custom exceptions are included (ActiveCheckoutExistsException, AssetNotAvailableException, ValidationException) to ensure proper validation and error handling.

The project ensures that an asset cannot be checked out if it is already in use or unavailable.

The AssetMain.java class acts as the application entry point and coordinates user operations.

The DBUtil class handles database connections for reading and writing asset-related data.

This project demonstrates important Core Java concepts like OOP, exception handling, multi-layer architecture, JDBC connectivity, and modular code design.

<img width="431" height="222" alt="image" src="https://github.com/user-attachments/assets/c66b363b-51d7-4732-9d77-9fe6b2e52ae3" />
