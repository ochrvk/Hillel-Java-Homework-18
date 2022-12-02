# Homework 18

## **Task 1:**   
Программно послать HEAD запрос для файла доступного по прямой ссылке, например:  
https://dl.dropboxusercontent.com/s/vxnydq4xjkmefrp/CLUVAL.java  

Скачать сначала первую половину этого файла, а потом докачать вторую.  
```
Range:bytes=0-500
```

## **Task 2:**   
Программно послать POST запрос на https://postman-echo.com/post где в BODY передать foo1=bar1&foo2=bar2 в формате x-www-form-urlencoded  

Ответ распарсить и вывести.  

## **Task 3*:**   
Написать класс MyApiService с использованием паттерна синглтон для доступа к API:  
(предварительно создать все необходимые модели List, Post, User...)  


### **Пример:**  
```
ApiService service = ApiService.getInstance();

List<Post> posts = service.getPosts();

List<User> users = service.getUses();
```


### **Для следующих запросов:**  

Posts https://jsonplaceholder.typicode.com/posts

Comments https://jsonplaceholder.typicode.com/comments

Albums https://jsonplaceholder.typicode.com/albums

Photos https://jsonplaceholder.typicode.com/photos

Users https://jsonplaceholder.typicode.com/users

Todos https://jsonplaceholder.typicode.com/todos
