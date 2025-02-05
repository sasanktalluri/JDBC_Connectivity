# JDBC Connectivity - Amigo Wallet  

This project demonstrates **JDBC connectivity** with **PostgreSQL** using **Java** and **Maven**. It connects to a PostgreSQL database, inserts records into a table, and retrieves data.  

## Technologies Used  
- **Java**  
- **PostgreSQL**  
- **JDBC (Java Database Connectivity)**  
- **Maven**  

## Key Features  
- Establishes a JDBC connection to PostgreSQL  
- Inserts and retrieves records from a table  
- Uses Maven for dependency management  

## Setup Steps  
1. Ensure **PostgreSQL** is installed and running.  
2. Create the **Amigo_Wallet** database and the **status** table.  
3. Update database credentials in `Main.java` if needed.  
4. Build and run the project using Maven.
   
Note: I used a statement interface instead of a prepared statement, which has the vulnerability of SQL injection.
