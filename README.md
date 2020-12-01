## SpringBoot Demo
1. docker 启动数据库
```
docker run -p 3306:3306 --name mysql \
-v /tmp/mysql/log:/var/log/mysql \
-v /tmp/mysql/data:/var/lib/mysql \
-v /tmp/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=111111  \
-d mysql:5.7
```

```
use blog_test;
create table user
(
    id                 bigint primary key auto_increment,
    username           varchar(100),
    encrypted_password varchar(100),
    avatar             varchar(100),
    created_at         datetime,
    updated_at         datetime
);

create table blog
(
    id                 bigint primary key auto_increment,
    user_id           bigint,
    title varchar(100),
    description varchar(100),
    content TEXT,
    created_at         datetime,
    updated_at         datetime
)
```