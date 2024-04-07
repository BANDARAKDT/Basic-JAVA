create database stockdb;

use stockdb;

create table category
(
    category_id int auto_increment
        primary key,
    name        varchar(45) not null
);

create table product
(
    product_id  int auto_increment
        primary key,
    name        varchar(45)  not null,
    description varchar(512) not null,
    price       float        not null,
    category_id int          not null,
    constraint category___fk
        foreign key (category_id) references category (category_id)
);


