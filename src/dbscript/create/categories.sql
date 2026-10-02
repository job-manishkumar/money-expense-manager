CREATE TABLE `categories` (
  `category_id` int NOT NULL,
  `category_code` int NOT NULL,
  `category_name` varchar(50) NOT NULL,
  `category_description` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_code` (`category_code`),
  UNIQUE KEY `category_name` (`category_name`),
  KEY `fk_category_customer_id` (`customer_id`),
  CONSTRAINT `fk_category_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci