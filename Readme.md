# Introduction

The Library Management System (LMS) is the project that i have developed during SEM-4, as an assignment given by java teacher.
The project has been fully self-made from scratch and i tried to provide as many as features i can into the project. To make it more attractive to use, i have added logo at each frame and created custom dialog boxes.

---

## Demo Screen-Shots of the LMS are :-

### Home Frame

![Home-Frame](/SS%20For%20Readme%20File/HomeFrame.png)

### Admin Login Frame

![Admin-Login-Frame](/SS%20For%20Readme%20File/AdminLoginFrame.png)

### Librarian LogIn Frame

![Librarian-LogIn-Frame](/SS%20For%20Readme%20File/LibrarianLogInFrame.png)

and many more ..., to see other exiting features view the feature section or experience download and run the project.

---

## To run the project follow below steps:-

For LMS, i have used NetBeans as an IDE, which makes the database connection and libraries integration with project easier.

The database i have used is PHPMyAdmin database and hence you require the XAMPP server and make sure to start the Apache and MYSQL services from the XAMPP panel and then goto the PHPMyAdmin page and create a new database named "library_management_system" and then import the SQL file i have provided along with the project using the import option in the PHPMyAdmin page and then all the required tables with appropriate columns will be created into the database and we are good to use it for our project.

The libraries i have used in project are :- mysql-connector-java-8.0.27.jar , which is required in project for database connection with MYSQL database and this library must be present in your system if you want to run the project. You can install the library from this [website](https://dev.mysql.com/downloads/connector/j/).

Once this two things has done being set-up then you can open the project in any IDE but recommended is NetBeans and first of all it will show error to resolve the library path for "mysql-connector-java-8.0.27.jar" library, so this select the path according to where you have stored it.

Now goto the services panel and there you have to link the database you have created for the LMS with the IDE and then it will create a link which we use for the connection to the database through IDE. That link will be similar to the one i have entered in the MyConnectionClass.java file.

Once the database connection link has been created you can run the project and login as admin using id : admin and password : admin123 (To add more admin user unfortunately i haven't provided any GUI feature so to add new admin you can add it directly via PhpMyAdmin by going to admin table and inserting new admin user). Then you can further perform tasks like add new librarian , remove librarian , log-in as librarian and many more.

---

## Extra information

Apart from normal frame files which states for what particular thing they have been used for, i have used some other files also to ease the development of project and make the code reusable.

- DialogSetterClass.java :- Used to display appropriate dialog (JOptionPane) on particular operation done in system.
- MyConnectionClass.java :- Used for Database Connection in each frames in my library system.
- SetLogoFile.java :- Used to set ICON/LOGO on each frame in the library system.

---

## Feature added by me are:-

- Current Date will be automatically added into textfield when check box is checked.

  ![Current-Date-TF](/SS%20For%20Readme%20File/DateFeature.PNG)
  
- Logo on each frame of Library Management System.

  ![Logo](/SS%20For%20Readme%20File/Logo.PNG)
  
- Customized dialog/ JOptionPane by setting Icon on it.

  ![Custom-Dialog](/SS%20For%20Readme%20File/LibrarianAddedSuccessfully.png)
  
- We get to know the history of the transaction / operation performed in database related to issuing book and returning book.

  ![history](/SS%20For%20Readme%20File/ReturnHistory.PNG)
  
- Admin can also do operations of librarian once logged in.

  ![admin-login](/SS%20For%20Readme%20File/AdminEnterAsLib.PNG)
