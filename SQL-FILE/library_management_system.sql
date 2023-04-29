-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2023 at 09:07 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(100) NOT NULL,
  `admin_name` varchar(225) NOT NULL,
  `admin_password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_password`) VALUES
(100, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `book_title` varchar(150) NOT NULL,
  `book_author` varchar(200) NOT NULL,
  `book_publisher` varchar(200) NOT NULL,
  `book_quantity` int(100) NOT NULL,
  `book_isbn` varchar(225) NOT NULL,
  `book_edition_no` varchar(100) NOT NULL,
  `book_date_added` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`book_title`, `book_author`, `book_publisher`, `book_quantity`, `book_isbn`, `book_edition_no`, `book_date_added`) VALUES
('Harry Potter and the Philosophers Stone', 'J. K. Rowling', 'Bloomsbury', 10, '0747532699', '1st', '17/02/2022'),
('Java: The Complete Reference', 'Herbert Schildt', 'Tata Mcgraw Hill', 20, '1260440230', '11th', '14/02/2022'),
('Graph Theory with Applications to Engineering and Computer Science', ' Thomas H. Martinson  and  Narsingh Deo', 'Prentice Hall India Learning Private Limited', 20, '8120301455', '1st', '17/02/2022'),
('Discrete Mathematics and Its Applications (SIE)', 'KENNETH H. ROSEN', 'McGraw Hill', 19, '9390727359', '8th', '17/02/2022'),
('Software Engineering (A Practitioner\'s Approach)', 'Roger S. Pressman and Bruce R. Maxim', 'Mc Graw Hill Education', 30, '9780078022128', '8th', '17/02/2022'),
('Let Us C', 'Yashavant Kanetkar', 'BPB publications', 20, '9788183331630', '17th', '13/02/2022'),
('Java How To Do Program', 'Paul J. Deitel', 'Prentice Hall', 50, '9789332563292', '10th', '15/02/2022');

-- --------------------------------------------------------

--
-- Table structure for table `issue_books`
--

CREATE TABLE `issue_books` (
  `book_title` varchar(150) NOT NULL,
  `book_author` varchar(150) NOT NULL,
  `book_edition_no` varchar(100) NOT NULL,
  `student_roll_num` int(100) NOT NULL,
  `student_name` varchar(150) NOT NULL,
  `student_class` varchar(100) NOT NULL,
  `date_of_issue` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issue_books`
--

INSERT INTO `issue_books` (`book_title`, `book_author`, `book_edition_no`, `student_roll_num`, `student_name`, `student_class`, `date_of_issue`) VALUES
('Discrete Mathematics and Its Applications (SIE)', 'KENNETH H. ROSEN', '8th', 5, 'dummyStudent2', 'SYCS', '10/02/2021');

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

CREATE TABLE `librarian` (
  `librarian_id` int(50) NOT NULL,
  `librarian_name` varchar(225) NOT NULL,
  `librarian_password` varchar(225) NOT NULL,
  `librarian_email` varchar(225) NOT NULL,
  `librarian_address` varchar(500) NOT NULL,
  `librarian_city` varchar(225) NOT NULL,
  `librarian_contact` varchar(225) NOT NULL,
  `librarian_date_of_join` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`librarian_id`, `librarian_name`, `librarian_password`, `librarian_email`, `librarian_address`, `librarian_city`, `librarian_contact`, `librarian_date_of_join`) VALUES
(1004, 'Test Librarian 1', 'TestLib123', 'testlib1@gmail.com', '65C7+46G, Railway Station Rd, opp. Ulhasnagarmy Railway Station, Yashwant Colony, Ulhasnagar, Maharashtra 421003', 'Ulhasnagar', '1234056789', '17/02/2022');

-- --------------------------------------------------------

--
-- Table structure for table `return_books`
--

CREATE TABLE `return_books` (
  `book_title` varchar(150) NOT NULL,
  `book_author` varchar(150) NOT NULL,
  `book_edition` varchar(80) NOT NULL,
  `student_name` varchar(150) NOT NULL,
  `student_class` varchar(80) NOT NULL,
  `student_roll_num` int(50) NOT NULL,
  `date_of_issue` varchar(100) NOT NULL,
  `date_of_return` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `admin_name` (`admin_name`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`book_isbn`);

--
-- Indexes for table `librarian`
--
ALTER TABLE `librarian`
  ADD PRIMARY KEY (`librarian_id`),
  ADD UNIQUE KEY `librarian_name` (`librarian_name`),
  ADD UNIQUE KEY `librarian_email` (`librarian_email`),
  ADD UNIQUE KEY `librarian_contact` (`librarian_contact`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `librarian`
--
ALTER TABLE `librarian`
  MODIFY `librarian_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1006;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
