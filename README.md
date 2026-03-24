# Task-23032026: Product Service
## Giới thiệu
Đây là ứng dụng cơ bản **quản lý sản phẩm** xây dựng bằng **Spring Boot + Thymeleaf**.
Ứng dụng cho phép người dùng sử dụng các chức năng thêm, xóa, sửa cơ bản.

---
## Tech-stack
- Java (JDK 21)
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap 5

---
## Chức năng
- Xem danh sách sản phẩm
- Thêm mới sản phẩm
- Xóa sản phẩm
- Chỉnh sửa sản phẩm
- Validation các trường trong quá trình thêm và xóa

---
## Cách chạy
### 1. Clone project
```
git clone https://github.com/baohc1705/intern-task-23032026.git
```
### 2. Định nghĩa file cấu hình
```
datasource:
 url: "jdbc:mysql://localhost:3306/yourdb"
 username: "yourusername"
 password: "yourpassword"
```
### 3. Chạy Maven
```
 mvn spring-boot:run 
```

### 4. Mở trình duyệt
``` http://localhost:8080/products 
```

---
## Tác giả
[baohc1705](https://github.com/baohc1705)

---
> NO PAIN NO GAIN 💪

