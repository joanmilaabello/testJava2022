-- brands
INSERT INTO brands (id, code)
VALUES (1, 'ZARA');
INSERT INTO brands (id, code)
VALUES (2, 'STRADIVARIUS');

-- prices
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35456, 1, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35456, 2, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (2, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (2, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (2, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (2, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35456, 1, 38.95, 'EUR');

INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2022-06-15 16:00:00', '2022-12-31 23:59:59', 4, 35457, 2, 38.95, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, rate_id, product_id, priority, price, currency_code)
VALUES (1, '2022-06-15 16:00:00', '2022-12-31 23:59:59', 4, 35457, 2, 38.95, 'EUR');

