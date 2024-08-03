# Event-Management-System

# Event Management System

A Java application to manage events, venues, and organizers using Java Spring Boot, MySQL.

## Project Structure

- **Backend**: Java Spring Boot
- **Database**: MySQL

## Features

- Create, Read, Update, Delete (CRUD) operations for Events, Venues, and Organizers
- RESTful API for backend operations

## Technologies Used

- Java Spring Boot
- Spring Data JPA
- MySQL

## Setup and Installation

### Prerequisites

- Java JDK 8 or later
- MySQL
- Maven

### Backend Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/event-management-system.git
    cd event-management-system
    ```

2. **Navigate to the backend directory:**
    ```bash
    cd backend
    ```

3. **Configure MySQL database in `src/main/resources/application.properties`:**
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/event_management
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

4. **Create the MySQL database:**
    ```sql
    CREATE DATABASE event_management;
    ```

5. **Build and run the Spring Boot application:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

The backend API will be running on `http://localhost:8080`.

## API Endpoints

### Event Endpoints

- `GET /events`: Get all events
- `GET /events/{id}`: Get event by ID
- `POST /events`: Create a new event
- `PUT /events/{id}`: Update an event
- `DELETE /events/{id}`: Delete an event
- `GET /events/venue/{venueId}`: Get events by venue
- `GET /events/organizer/{organizerId}`: Get events by organizer

### Venue Endpoints

- `GET /venues/{id}`: Get venue by ID
- `POST /venues`: Create a new venue
- `PUT /venues/{id}`: Update a venue
- `DELETE /venues/{id}`: Delete a venue

### Organizer Endpoints

- `GET /organizers/{id}`: Get organizer by ID
- `POST /organizers`: Create a new organizer
- `PUT /organizers/{id}`: Update an organizer
- `DELETE /organizers/{id}`: Delete an organizer

## Contributing

Feel free to submit issues and pull requests for any improvements.

## License

This project is licensed under the MIT License.

## Contact

For any inquiries, please contact Utkarsh Kurane at utkarshkurane27@gmail.com
