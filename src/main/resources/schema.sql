CREATE TABLE brands (id SMALLINT NOT NULL AUTO_INCREMENT, code VARCHAR(20) NOT NULL, PRIMARY KEY (id));
CREATE TABLE prices (id BIGINT NOT NULL AUTO_INCREMENT, brand_id SMALLINT NOT NULL, start_date DATETIME NOT NULL, end_date DATETIME NOT NULL, rate_id SMALLINT NOT NULL, product_id INTEGER NOT NULL, priority SMALLINT NOT NULL, price DECIMAL(6,2) NOT NULL, currency_code VARCHAR(3) NOT NULL, PRIMARY KEY (id), FOREIGN KEY (brand_id) REFERENCES brands(id));
CREATE INDEX ix_prices_brand_id_product_id ON prices(brand_id, product_id);

