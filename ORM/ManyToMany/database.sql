create database usersdb;

use usersdb;

create table tblgroups
(
    group_id int auto_increment
        primary key,
    name     varchar(45) not null
);

create table users
(
    user_id  int auto_increment
        primary key,
    username varchar(45) not null,
    password varchar(45) not null,
    email    varchar(45) not null
);

create table Users_Groups
(
    user_id  int not null,
    group_id int not null,
    primary key (user_id, group_id),
    constraint fk_group
        foreign key (group_id) references tblgroups (group_id),
    constraint fk_user
        foreign key (user_id) references users (user_id)
);

