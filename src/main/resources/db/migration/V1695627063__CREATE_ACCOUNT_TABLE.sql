create table if not exists account
(
    id         bigserial primary key,
    email      varchar(50) unique,
    );