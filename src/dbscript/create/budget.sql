CREATE TABLE `budget` (
  `budget_id` int NOT NULL,
  `budget_amount` decimal(19,2) DEFAULT '0.00',
  `budget_day` decimal(19,2) DEFAULT NULL,
  `budget_week` decimal(19,2) DEFAULT NULL,
  `budget_month` decimal(19,2) DEFAULT NULL,
  `budget_year` decimal(19,2) DEFAULT NULL,
  `category_id` int NOT NULL,
  `customer_id` int NOT NULL,
  PRIMARY KEY (`budget_id`),
  KEY `fk_budget_category_id` (`category_id`),
  KEY `fk_budget_customer_id` (`customer_id`),
  CONSTRAINT `fk_budget_category_id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`),
  CONSTRAINT `fk_budget_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci