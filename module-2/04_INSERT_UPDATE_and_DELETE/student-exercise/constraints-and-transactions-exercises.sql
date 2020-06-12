-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
VALUES ('Hampton', 'Avenue'), ('Lisa', 'Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film(title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor(actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue' ),
        (SELECT film_id FROM film WHERE title = 'Euclidean PI'));
        
INSERT INTO film_actor(actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway'),
       (SELECT film_id FROM film WHERE title = 'Euclidean PI'));
       

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category(film_id, category_id)
VALUES((SELECT film_id FROM film WHERE title = 'EGG IGBY' ), (SELECT category_id FROM category WHERE name = 'Mathmagical' ));
INSERT INTO film_category(film_id, category_id)
VALUES((SELECT film_id FROM film WHERE title = 'KARATE MOON' ), (SELECT category_id FROM category WHERE name = 'Mathmagical' ));
INSERT INTO film_category(film_id, category_id)
VALUES((SELECT film_id FROM film WHERE title = 'YOUNG LANGUAGE' ), (SELECT category_id FROM category WHERE name = 'Mathmagical' ));

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film 
SET rating = 'G'
WHERE film_id IN (SELECT film_id FROM film_category fc INNER JOIN category c ON fc.category_id = c.category_id WHERE name = 'Mathmagical');

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)
SELECT (SELECT film_id FROM film WHERE title = 'Euclidean PI'), store_id FROM store;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
SELECT * FROM film WHERE title = 'Euclidean PI';
DELETE FROM film WHERE title = 'Euclidean PI';
--violates key constraint--

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
SELECT * FROM category  WHERE name = 'Mathmagical';
DELETE FROM category WHERE name = 'Mathmagical';
--foreign key constraint--

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
SELECT * FROM film_category WHERE category_id = 17;
DELETE FROM film_category WHERE category_id = 17;
--yes, I don't know why :))--

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
SELECT * FROM category WHERE name = 'Mathmagical';
DELETE FROM category WHERE name = 'Mathmagical';
--success!!--
DELETE FROM film WHERE title = 'Euclidean PI';
--did not work due to foreign key constraint--

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;

--just guessing here, but in order to delete Euclidean PI would we need to first add the Mathmagical category back and delete each film title category one by one??--
