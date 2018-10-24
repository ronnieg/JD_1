-- Create dataset
create table books_joins.books (
  _id int not null auto_increment primary key,
  book_name VARCHAR(255) not null,
  page_count int not null,
  genre varchar(255) not null
);

create table books_joins.authors (
  _id int not null auto_increment primary key,
  author varchar(255),
  date_of_birthday int,
  nationality varchar(255)
);

create table books_joins.book_authors (
  _id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  book_id INT,
  author_id INT,
  FOREIGN KEY (author_id) REFERENCES books_joins.authors(_id),
  FOREIGN KEY (book_id) REFERENCES books_joins.books(_id)
);

INSERT INTO books_joins.books VALUES
                                                       (_id, 'Functional-Light JavaScript: Pragmatic, Balanced FP in JavaScript', 388, 'Tech'),
                                                       (_id, 'You Don\'t Know JS: Scope & Closures', 98, 'Tech'),
                                                       (_id, 'River Bodies (Northampton County)', 290,'Murder Thrillers'),
                                                       (_id, 'Programming in Scala: Updated for Scala 2.12', 837, 'Tech'),
                                                       (_id, 'Scala High Performance Programming', 274, 'Tech'),
                                                       (_id, 'Apache Spark Graph Processing', 148, 'Tech')
;
INSERT INTO books_joins.authors VALUES
                                                                   (_id, 'Kyle Simpson', 1980, 'American'),
                                                                   (_id, 'Brian Lonsdorf', 1973, 'American'),
                                                                   (_id, 'Jasmine Kwityn', 1992, 'Canadian'),
                                                                   (_id, 'Karen Katchur', 1990, 'American'),
                                                                   (_id, 'Vincent Theon', 1979, 'French'),
                                                                   (_id, 'Michael Diamant', 1985, 'Canadian')
;
INSERT INTO books_joins.book_authors VALUES
                                                           (_id, 3, 4),
                                                           (_id, 1, 1),
                                                           (_id, 1, 2),
                                                           (_id, 1, 3),
                                                           (_id, 2, 1),
                                                           (_id, 2, 2),
                                                           (_id, 4, 2),
                                                           (_id, 5, 5),
                                                           (_id, 5, 6),
                                                           (_id, 6, 3),
                                                           (_id, 6, 5)
;
-- Queries

select * from book_authors;
select * from books;
select * from authors;

-- task01
select a.author as book_author,
       b.book_name as book_name
from book_authors ba
join authors a on ba.author_id = a.`_id`
join books b on ba.book_id = b._id;

-- task02
select a.author as book_author,
       b.book_name as book_name,
       a.nationality as nationality
from book_authors ba
       join authors a on ba.author_id = a.`_id`
       join books b on ba.book_id = b._id
where a.nationality = 'French';

-- task03
select a.author as book_author,
       b.book_name as book_name,
       a.date_of_birthday
from book_authors ba
       join authors a on ba.author_id = a.`_id`
       join books b on ba.book_id = b._id
where a.date_of_birthday > 1900;

-- task04


