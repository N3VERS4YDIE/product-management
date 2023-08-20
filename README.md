# Product Management System

This project is a simple Java-based product management system that allows you to manage products in a database. The system includes a GUI (graphical user interface) built using Java Swing, and uses the Apache Ant build tool. The project also includes a Python script for generating fake data to populate the database.

## Features

- View a list of all products stored in the database.
- Add new products to the database.
- Update existing product information.
- Delete products from the database.
- Filter products based on their category.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK)**: Make sure you have JDK (Java Development Kit) version 8 or higher installed on your system. You can download the latest version of JDK from the [Oracle JDK website](https://www.oracle.com/java/technologies/downloads/) or use an alternative like [OpenJDK](https://adoptopenjdk.net/).

- **Database**: The project uses a database to store product information. You can choose to use either MySQL or MariaDB. You can also use software stacks like XAMPP, WAMP, MAMP, or LAMP which already bundle MySQL and other tools.

## Directory Structure

```bash
.
├── build.xml
├── db
│   ├── faker_data.sql
│   └── product_management.sql
├── lib
│   ├── flatlaf-3.1.1.jar
│   ├── flatlaf-intellij-themes-3.1.1.jar
│   ├── mariadb-java-client-3.1.4.jar
├── nbproject
│   ├── ...
├── scripts
│   └── sql_faker.py
└── src
    ├── controllers
    │   └── ProductController.java
    ├── entities
    │   └── Product.java
    ├── main
    │   └── Main.java
    ├── models
    │   ├── DB.java
    │   └── ProductModel.java
    ├── resources
    │   ├── ...
    └── views
        ├── ProductView.form
        └── ProductView.java
```

## Database Setup

Import the provided SQL file `product_management.sql` located at `db` into you database to set up the `products` table.

### For XAMPP or Similar Stacks

If you prefer to use XAMPP or a similar software stack, follow these steps:

1. Open your chosen control panel and start the Apache and MySQL services.
2. Access the database management tool (usually phpMyAdmin) by going to [http://localhost/phpmyadmin](http://localhost/phpmyadmin) in your web browser.
3. Create a new database called `product_management` or select an existing database.
4. Import the SQL file `product_management.sql`.

### For MySQL/MariaDB

If you prefer to use MySQL/MariaDB directly from your terminal follow these steps:

1. Open a terminal and run MySQL server:

   Unix/Linux:

   ```bash
    sudo service mysql start
   ```

   Windows:

   ```bash
    mysqld
   ```

2. Create a new database:

   ```bash
   mysql -u username -p -e "CREATE DATABASE product_management;"
   ```

   > [!NOTE]
   > If you don't have a username and password, use `root` as the username and don't use the `-p` argument, or just press ENTER when prompted to enter the password.

3. Navigate to the `db` directory and import the file `product_management.sql`:

   ```bash
   mysql -u username -p product_management < product_management.sql
   ```

   > [!NOTE]
   > If you are using PowerShell, the `<` operator for input redirection has a different behavior. Instead use:
   >
   > ```powershell
   > Get-Content product_management.sql | mysql -u username -p product_management
   > ```
   >
   > or
   >
   > ```powershell
   > cmd.exe /c "mysql -u username -p product_management < product_management.sql"
   > ```

## Usage

1. Make sure your MySQL server is running.
2. Open the project in your Java IDE of choice.
3. Locate the `DB.java` file in the `models` directory and update the `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` fields to match your MySQL database configuration.
4. Run the project.

## License

This project is released under the [MIT License](/LICENSE). Feel free to modify and extend this project for your own use.
