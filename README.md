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

## Changelog

**Period:** 2025-12-21 ~ 2025-12-28

> 🤖 *AI가 분석한 변경사항 요약*

---

### 📅 2025-12-28

**`14:29`** | `61a7102` | @Hanbeom-Park

**docs: Update changelog (2025-12-28)**

> 이 커밋은 2025년 12월 28일 기준으로 변경 기록(changelog)을 업데이트합니다. 구체적으로 README.md 파일의 변경 내용에는 AI 분석 요약 섹션이 추가되었으며, 기능(feat) 관련 내용을 포함하고 있습니다.

---

**`14:21`** | `42cd3af` | @Hanbeom-Park

**docs: Update changelog (2025-12-28)**

> docs: Update changelog (2025-12-28)

---

**`12:51`** | `ee791b8` | @Hanbeom-Park

**수정**

> 수정

---

**`12:17`** | `3a5051a` | @Hanbeom-Park

**feat: 기능 추가**

> feat: 기능 추가

---

**`12:16`** | `757970a` | @Hanbeom-Park

**chore: .gitignore 수정**

> chore: .gitignore 수정

---

**`11:53`** | `30dffcd` | @Hanbeom-Park

**add: add .gitignore**

> 이 커밋은 Java, Gradle, IntelliJ 개발 환경에 필요한 .gitignore 파일을 추가했습니다. 이 파일은 빌드 파일, IDE 설정 파일 등 불필요한 파일들을 Git 추적에서 제외하여 저장소를 깔끔하게 유지하는 데 도움이 됩니다.

---
