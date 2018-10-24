create table books (
  _ID INT NOT NULL auto_increment,
  title varchar(30),
  genre varchar(20),
  year_publishing INT(4),
  _id_author INT,
  primary key (_ID),
  foreign key (_ID) references authors(_ID)
);

create table authors (
  _ID INT NOT NULL auto_increment,
  name varchar(20),
  last_name varchar(20),
  country varchar(20),
  primary key (_ID)
);
select * from authors;
select * from books;
INSERT INTO authors values (_ID,'Ernest', 'Hemingway', 'USA');
INSERT INTO authors values (_ID,'Mikhail', 'Lermontov', 'Russian Empire');
INSERT INTO authors values (_ID,'Alexander', 'Pushkin', 'Russian Empire');
INSERT INTO authors values (_ID,'Leo', 'Tolstoy', 'Russian Empire');
INSERT INTO authors values (_ID,'Sergei', 'Yesenin', 'Russian Empire');
commit;
INSERT INTO books values (_ID, 'The Torrents of Spring', 'Novellas', 1926, 1);
INSERT INTO books values (_ID, 'Three Stories and Ten Poems', 'Story Collections', 1923, 1);
INSERT INTO books values (_ID, 'The Corsair', 'Poems', 1828, 2);
INSERT INTO books values (_ID, 'Borodino', 'Poems', 1837, 2);
INSERT INTO books values (_ID, 'Boris Godunov', 'Drama', 1825, 3);
INSERT INTO books values (_ID, 'The Little Tragedies', 'Drama', 1830, 2);
INSERT INTO books values (_ID, 'The Raid', 'Short stories', 1852, 4);
INSERT INTO books values (_ID, 'My Dream', 'Short stories', 1911, 4);
INSERT INTO books values (_ID, 'The Scarlet of the Dawn', 'Lyrical', 1910, 5);
INSERT INTO books values (_ID, 'The Birch Tree', 'Lyrical', 1913, 5);
update books set _id_author = 3 where title = 'The Little Tragedies';

truncate table authors;
SET FOREIGN_KEY_CHECKS=0; DROP TABLE authors;
truncate table books;
-- task04

select * from authors;
select * from books.books;
select b.title, a.name, a.last_name, b.year_publishing from books.books b, books.authors a  where b._id_author = a._id order by b.year_publishing asc;
select b.title, a.name, a.last_name, b.year_publishing from books.books b, books.authors a  where b._id_author = a._id order by b.year_publishing desc;

-- task05
select a.name, a.last_name, count(*) as count_books from  books.books b, books.authors a  where b._id_author = a._id and a.last_name = 'Lermontov';