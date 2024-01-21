create table users( email varchar primary key,name varchar(50), password varchar(100), security_question varchar(100), answer varchar(50), status varchar(10), role varchar(20));
select * from users;

create  table rooms(room_number varchar primary key, room_type varchar(30),bed varchar(30), price int, status varchar(10));
select * from rooms;

create table transactions(id int primary  key, name varchar(50), phone_number varchar(20), nationality varchar(50), gender varchar(20), email varchar(50), id_card varchar(200), address varchar(300), check_in_date varchar(50), room_number varchar(10), bed varchar(30), room_type varchar(30), price int, duration_days int, total_price varchar(100), check_out_date varchar(50));
select * from t transactions;