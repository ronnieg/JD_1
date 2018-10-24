create table countries (
  name varchar(30),
  population int,
  area int,
  language varchar(20)
);

insert into countries.countries values
                                           ('Russia', 143420300, 17075200, 'Russian'),
                                           ('Canada', 32805000, 9976140, 'English'),
                                           ('USA', 295734100, 9629091, 'English'),
                                           ('China', 1306313800, 9596960, 'Chinese'),
                                           ('Brazil', 186112800, 8511965, 'English'),
                                           ('India', 1080264400, 3287590, 'English'),
                                           ('Egypt', 77505800, 1001450, 'English'),
                                           ('Ukrain', 47425300, 603700, 'Ukrainian'),
                                           ('France', 60656200, 547030, 'French'),
                                           ('Spain', 40341500, 504000, 'Spanish')
                                           ;
commit;

select * from countries.countries c where c.population > 50000000;

select * from countries.countries c1 order by 2;

select sum(c2.population) from (select * from countries.countries c1 order by 2 limit 5) c2;

update countries.countries c3 set c3.language = 'Russian' where c3.name = 'Spain';
commit;

DELETE FROM  countries.countries
WHERE population = (SELECT x.population
               FROM (SELECT MAX(t.population) AS population FROM countries.countries t) x);

truncate table countries.countries;