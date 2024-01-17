create table users( email varchar primary key,name varchar(50), password varchar(100), security_question varchar(100), answer varchar(50), status varchar(10), role varchar(20));
select * from users;

create  table rooms(room_number varchar primary key, room_type varchar(30),bed varchar(30), price int, status varchar(10));
select * from rooms;