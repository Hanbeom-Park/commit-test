# Spring MVC Bulletin Board

A simple bulletin board system built with Spring Boot and Spring MVC.

## Features

- View a list of posts
- Create new posts
- Edit existing posts
- Delete posts
- Search posts by title
- View post details

## Technologies Used

- Spring Boot 3.2.2
- Spring MVC
- Spring Data JPA
- H2 Database
- Thymeleaf
- Bootstrap 5

## Getting Started

### Prerequisites

- Java 21 or higher
- Gradle

### Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application using Gradle:

```bash
./gradlew bootRun
```

4. Open a web browser and go to http://localhost:8080

### Using the Bulletin Board

- The home page displays a list of all posts
- Click on "New Post" to create a new post
- Click on a post title to view the full post
- Use the Edit and Delete buttons to manage posts
- Use the search box to find posts by title

## Database

The application uses an in-memory H2 database, which means all data will be lost when the application is restarted. The H2 console is enabled and can be accessed at http://localhost:8080/h2-console with the following settings:

- JDBC URL: jdbc:h2:mem:boarddb
- Username: sa
- Password: (leave empty)

## Sample Data

The application is pre-loaded with sample posts to demonstrate functionality.

## Project Structure

- `model`: Contains the Post entity
- `repository`: Contains the PostRepository interface
- `service`: Contains the PostService class
- `controller`: Contains the controllers for handling HTTP requests
- `config`: Contains configuration classes
- `templates`: Contains Thymeleaf templates for the views
