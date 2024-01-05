create table if not exists shoes (
    id serial primary key,
    title varchar(255),
    image text,
    price numeric
)