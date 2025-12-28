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

**`14:37`** | `e1abb92` | @Hanbeom-Park

**docs: Update changelog (2025-12-28)**

> 이 커밋은 `README.md` 파일의 변경 로그(changelog)를 갱신합니다. 기존 기능 추가 항목을 삭제하고 새로운 내용으로 대체하거나 재구성하는 등 전반적인 변경 사항이 포함됩니다.

---

**`14:29`** | `61a7102` | @Hanbeom-Park

**docs: Update changelog (2025-12-28)**

> 이 커밋은 `README.md` 파일의 변경 로그를 업데이트했습니다. 2025년 12월 21일부터 12월 28일까지의 변경사항에 대해 AI가 분석한 요약을 추가하고, 기존의 `feat: 기능 추가`와 같은 항목을 새로운 기능(`✨ Features`) 섹션으로 대체했습니다.

---

**`14:21`** | `42cd3af` | @Hanbeom-Park

**docs: Update changelog (2025-12-28)**

> 이 커밋은 `README.md` 파일에 변경 로그 내용을 추가하여 갱신했습니다. 총 17줄의 새로운 내용이 더해졌습니다.

---

**`12:51`** | `ee791b8` | @Hanbeom-Park

**수정**

> 이 커밋은 Spring Boot 프레임워크 버전을 4.0.1에서 3.2.2로 변경했습니다. 또한, `layout.html` 파일에서 탐색 링크의 CSS 클래스 적용 로직을 수정했습니다.

---

**`12:17`** | `3a5051a` | @Hanbeom-Park

**feat: 기능 추가**

> 이 커밋은 Spring Boot와 Spring MVC를 활용한 새로운 게시판 시스템 프로젝트를 초기화합니다. 프로젝트의 빌드 설정, 실행 스크립트, 그리고 기본적인 애플리케이션 구조를 포함한 초기 개발 환경이 구성되었습니다.

---

**`12:16`** | `757970a` | @Hanbeom-Park

**chore: .gitignore 수정**

> 이 커밋은 `.gitignore` 파일에서 기존의 특정 한 줄을 삭제하고 새로운 한 줄로 교체했습니다. 이는 아마도 기존의 무시 규칙을 수정하거나 업데이트하기 위한 변경으로 보입니다.

---

**`11:53`** | `30dffcd` | @Hanbeom-Park

**add: add .gitignore**

> 이 커밋은 자바, Gradle, IntelliJ 프로젝트에서 Git이 추적하지 않아야 할 파일들을 명시하는 `.gitignore` 파일을 새로 추가했습니다. 이 파일은 프로젝트 관련 불필요한 파일들이 커밋되는 것을 방지합니다.

---
