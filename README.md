# E-Commerce API
## Description
This project is an e-commerce application built using the Spring Boot API framework on the Java platform. It focuses primarily on learning debugging and testing skills with the help of Postman. The front-end portion has been pre-built for this project and is already operational. 

The website uses Spring Boot API for the backend server and MySQL database for data storage. The existing backend project code is modified to fix bugs and implement new features. Postman is also used to test application endpoints and logic.

## Requirements
  - Users
- Users already have the ability to register and log in, but in order to make purchases, a user must have an address on file
  - You will need to modify the User ProfileController and allows
users to add or edit their addresses.
- The database structure for this change should not need to be modified, but you will need to modify the existing controller, and add logic to the User Profile Do data access object to add this feature
  - Shopping cart
- Users need the ability to add and remove items from the cart - the application should remember what is in a user's cart the next time they log into the site
- Users must be logged in to view or edit their shopping cart - this means that you will need to implement Authentication in the ShoppingCartController in order to know who is logged in, and then get the cart details from the database
- There is currently no shopping Cart Dao data access object, so you will need to add the DAO, and implement all necessary JDBC objects and logic.
- You will also need to add the appropriate database table(syou're your database script to implement the shopping cart feature
    - Checkout
- Checking out entails converting the shopping cart into an order
- Only logged-in users should be allowed to check out o You will need to create a new OrdersController and an OrderDao for data access.
- You will also need to modify the database script to add the necessary
