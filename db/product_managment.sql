-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2023 at 01:58 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `product_managment`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` tinyint(2) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  `distributor` varchar(30) NOT NULL,
  `category` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `distributor`, `category`) VALUES
(1, 'ASUS ROG Strix', '816.56', 'PcComponentes', 'motherboard'),
(2, 'Western Digital Blue', '244.45', 'Amazon', 'hdd'),
(3, 'ADATA XPG SX8200 Pro', '564.41', 'Mercado Libre', 'ssd'),
(4, 'GIGABYTE Aorus', '904.42', 'Exito', 'motherboard'),
(5, 'NVIDIA GeForce RTX 3', '954.70', 'Micro Center', 'gpu'),
(6, 'AMD Ryzen 7', '214.55', 'PcComponentes', 'cpu'),
(7, 'MSI MPG Gaming', '479.35', 'PcComponentes', 'motherboard'),
(8, 'NVIDIA GeForce GTX 1', '903.43', 'Newegg', 'gpu'),
(9, 'NVIDIA GeForce GTX 1', '150.61', 'Falabella', 'gpu'),
(10, 'ASUS TUF Gaming', '441.15', 'Ktronix', 'motherboard'),
(11, 'Toshiba P300', '771.89', 'Mercado Libre', 'hdd'),
(12, 'HGST Deskstar', '929.94', 'Falabella', 'hdd'),
(13, 'GIGABYTE Aorus', '246.94', 'Exito', 'motherboard'),
(14, 'NVIDIA GeForce RTX 3', '695.97', 'PcComponentes', 'gpu'),
(15, 'Kingston HyperX Fury', '377.11', 'Micro Center', 'ram'),
(16, 'Kingston HyperX Fury', '747.19', 'Newegg', 'ram'),
(17, 'Intel Core i9', '586.92', 'Mercado Libre', 'cpu'),
(18, 'Intel Core i5', '989.24', 'Micro Center', 'cpu'),
(19, 'AMD Ryzen 9', '171.36', 'Micro Center', 'cpu'),
(20, 'Samsung 970 EVO', '470.00', 'Micro Center', 'ssd'),
(21, 'G.Skill Ripjaws V', '884.69', 'Micro Center', 'ram'),
(22, 'AMD Radeon RX 5600 X', '518.10', 'Newegg', 'gpu'),
(23, 'Toshiba P300', '931.47', 'Mercado Libre', 'hdd'),
(24, 'ADATA XPG Spectrix', '149.75', 'Newegg', 'ram'),
(25, 'Crucial Ballistix', '614.52', 'Ktronix', 'ram'),
(26, 'NVIDIA GeForce RTX 3', '735.10', 'Alkosto', 'gpu'),
(27, 'Corsair Vengeance LP', '176.07', 'Falabella', 'ram'),
(28, 'ASUS ROG Strix', '617.54', 'Ktronix', 'motherboard'),
(29, 'AMD Radeon RX 6700 X', '961.93', 'Exito', 'gpu'),
(30, 'GIGABYTE Aorus', '870.55', 'Exito', 'motherboard'),
(31, 'MSI MPG Gaming', '273.74', 'Alkosto', 'motherboard'),
(32, 'HGST Deskstar', '360.59', 'Newegg', 'hdd'),
(33, 'MSI PRO', '424.13', 'Mercado Libre', 'motherboard'),
(34, 'ASUS ROG Strix', '388.95', 'Amazon', 'motherboard'),
(35, 'AMD Radeon RX 6800 X', '538.03', 'Exito', 'gpu'),
(36, 'NVIDIA GeForce RTX 3', '558.43', 'Micro Center', 'gpu'),
(37, 'Team T-Force Delta R', '926.08', 'Falabella', 'ram'),
(38, 'Team T-Force Delta R', '246.74', 'Ktronix', 'ram'),
(39, 'WD Blue SN550', '328.15', 'Amazon', 'ssd'),
(40, 'Corsair Vengeance LP', '556.57', 'Newegg', 'ram'),
(41, 'WD Blue SN550', '249.02', 'Exito', 'ssd'),
(42, 'AMD Ryzen 7', '983.31', 'Ktronix', 'cpu'),
(43, 'AMD Ryzen 9', '864.77', 'Exito', 'cpu'),
(44, 'Toshiba P300', '878.97', 'Falabella', 'hdd'),
(45, 'NVIDIA GeForce RTX 3', '892.18', 'Alkosto', 'gpu'),
(46, 'NVIDIA GeForce RTX 3', '263.88', 'Alkosto', 'gpu'),
(47, 'AMD Radeon RX 6700 X', '103.79', 'Alkosto', 'gpu'),
(48, 'Seagate Barracuda', '659.23', 'Amazon', 'hdd'),
(49, 'MSI MPG Gaming', '550.20', 'Mercado Libre', 'motherboard'),
(50, 'Crucial MX500', '482.05', 'Newegg', 'ssd'),
(51, 'Crucial Ballistix', '59.76', 'PcComponentes', 'ram'),
(52, 'AMD Radeon RX 5600 X', '997.43', 'Newegg', 'gpu'),
(53, 'Toshiba P300', '215.47', 'PcComponentes', 'hdd'),
(54, 'ASUS ROG Strix', '812.90', 'Micro Center', 'motherboard'),
(55, 'Seagate Barracuda', '915.34', 'Falabella', 'hdd'),
(56, 'ASRock Steel Legend', '420.93', 'Ktronix', 'motherboard'),
(57, 'Team T-Force Delta R', '211.31', 'PcComponentes', 'ram'),
(58, 'MSI MPG Gaming', '929.34', 'Amazon', 'motherboard'),
(59, 'Western Digital Blue', '283.98', 'Alkosto', 'hdd'),
(60, 'Intel Core i5', '670.49', 'Falabella', 'cpu'),
(61, 'AMD Radeon RX 6700 X', '305.46', 'PcComponentes', 'gpu'),
(62, 'ASRock Steel Legend', '156.48', 'Ktronix', 'motherboard'),
(63, 'NVIDIA GeForce RTX 3', '117.23', 'Micro Center', 'gpu'),
(64, 'Intel Core i9', '926.60', 'Alkosto', 'cpu'),
(65, 'ASUS ROG Strix', '792.07', 'Amazon', 'motherboard'),
(66, 'Crucial MX500', '535.83', 'Falabella', 'ssd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` tinyint(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
