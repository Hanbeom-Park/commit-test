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

### ✨ Features

- **feat: 기능 추가** (3a5051a)
  - **Spring Boot와 Spring MVC를 사용하여 간단한 게시판 시스템을 구축하는 기능이 추가되었습니다.**

해당 커밋은 Spring Boot와 Spring MVC 기반의 게시판 프로젝트를 새로 생성하는 데 필요한 핵심 파일들을 추가했습니다. 여기에는 빌드 설정, Gradle 래퍼, 실행 스크립트, README 파일 등이 포함됩니다.
  - *@Hanbeom-Park (2025-12-28)*

- **add: add .gitignore** (30dffcd)
  - 이 커밋은 Java, Gradle, IntelliJ 개발 환경에서 불필요한 파일들이 Git 추적에서 제외되도록 `.gitignore` 파일을 추가했습니다. 이를 통해 프로젝트 관리의 효율성을 높이고 Git 저장소를 깔끔하게 유지할 수 있습니다.
  - *@Hanbeom-Park (2025-12-28)*

### 📚 Documentation

- **docs: Update changelog (2025-12-28)** (42cd3af)
  - ## Git 커밋 분석 및 요약

**핵심 변경 내용:**

*   `README.md` 파일에 2025년 12월 28일자 변경 기록이 추가되었습니다.
*   주요 변경 사항으로는 애플리케이션의 샘플 게시물 로딩 기능 설명과 `controller`, `config` 디렉토리의 역할 설명이 업데이트되었습니다.

**간결한 요약:**

`README.md`의 변경 기록에 2025년 12월 28일자 내용을 추가하며, 애플리케이션 기능 설명과 특정 디렉토리 역할을 업데이트했습니다.
  - *@Hanbeom-Park (2025-12-28)*

### 🔧 Chores

- **chore: .gitignore 수정** (757970a)
  - IntelliJ IDEA 관련 불필요한 파일이 `.gitignore`에서 제외되었습니다.
  - *@Hanbeom-Park (2025-12-28)*

### 📦 Other Changes

- **수정** (ee791b8)
  - 이 커밋은 Spring Boot 버전을 4.0.1에서 3.2.2로 업데이트하고, 관련 문서를 수정하여 변경 사항을 반영했습니다.
  - *@Hanbeom-Park (2025-12-28)*
