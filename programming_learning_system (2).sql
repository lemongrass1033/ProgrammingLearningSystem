-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2026 at 10:35 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `programming_learning_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `completion_status`
--

CREATE TABLE `completion_status` (
  `status_id` int(11) NOT NULL,
  `enrollment_id` int(11) DEFAULT NULL,
  `completion_percentage` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `completion_status`
--

INSERT INTO `completion_status` (`status_id`, `enrollment_id`, `completion_percentage`) VALUES
(2, 3, 30),
(3, 4, 0),
(4, 5, 0),
(5, 6, 0);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(100) NOT NULL,
  `capacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`course_id`, `course_name`, `capacity`) VALUES
(3, 'Database Systems', 40),
(4, 'Computer Networking', 20),
(5, 'Python Programming', 35),
(6, 'Software Engineering', 30),
(7, 'C language', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `enrollment_id` int(11) NOT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `enrollment_status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `enrollment`
--

INSERT INTO `enrollment` (`enrollment_id`, `user_email`, `course_id`, `enrollment_status`) VALUES
(3, 'minji@gmail.com', 1, 'Active'),
(5, 'test@gmail.com', 7, 'Active'),
(6, 'test@gmail.com', 6, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `learning_progress`
--

CREATE TABLE `learning_progress` (
  `progress_id` int(11) NOT NULL,
  `enrollment_id` int(11) DEFAULT NULL,
  `progress_percentage` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `learning_progress`
--

INSERT INTO `learning_progress` (`progress_id`, `enrollment_id`, `progress_percentage`) VALUES
(2, 3, 0),
(3, 4, 0),
(4, 5, 0),
(5, 6, 0);

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE `material` (
  `materialID` int(11) NOT NULL,
  `fileName` varchar(255) DEFAULT NULL,
  `fileType` varchar(50) DEFAULT NULL,
  `topicID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `material`
--

INSERT INTO `material` (`materialID`, `fileName`, `fileType`, `topicID`) VALUES
(1, 'OOP.pdf', 'PDF', 12),
(2, 'JavaBasics.pdf', 'PDF', 12),
(10, 'JavaNotes.pdf', 'PDF', 13),
(14, 'Java.pdf', 'PDF', 14),
(15, 'JavaFile.pdf', 'PDF', 16);

-- --------------------------------------------------------

--
-- Table structure for table `team_selection`
--

CREATE TABLE `team_selection` (
  `id` int(11) NOT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `teammate_name` varchar(100) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `team_selection`
--

INSERT INTO `team_selection` (`id`, `user_email`, `teammate_name`, `created_at`) VALUES
(1, 'minji@gmail.com', 'tom@gmail.com', '2026-06-17 20:20:17');

-- --------------------------------------------------------

--
-- Table structure for table `topic`
--

CREATE TABLE `topic` (
  `topicID` int(11) NOT NULL,
  `topicName` varchar(100) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `topic`
--

INSERT INTO `topic` (`topicID`, `topicName`, `course_id`) VALUES
(12, 'Inheritance', 0),
(13, 'Abstraction', 0),
(14, 'OOP', 1),
(15, 'Abstraction', 1),
(16, 'FileProcess', 7);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `skill` varchar(100) DEFAULT NULL,
  `github_link` varchar(255) DEFAULT NULL,
  `role` varchar(20) DEFAULT 'User',
  `status` varchar(20) DEFAULT 'Active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `email`, `password`, `skill`, `github_link`, `role`, `status`) VALUES
(1, 'Ali', 'ali@gmail.com', '123', 'Database', '', 'Instructor', 'Inactive'),
(2, 'haerin', 'haerin@gmail.com', '123', '', '', 'Instructor', 'Active'),
(3, 'minji', 'minji@gmail.com', '123', '', '', 'User', 'Active'),
(4, 'minji', 'minji@gmail.com', '123', '', '', 'User', 'Active'),
(5, 'minji', 'minji@gmail.com', '123', '', '', 'User', 'Active'),
(6, 'hanni', 'hanni@gmail.com', '123', 'Java', '', 'Admin', 'Active'),
(7, 'KARINA', 'karina@gmail.com', '123', 'Database', '', 'Admin', 'Active'),
(8, 'zyz', 'zyz@gmail.com', '123', 'Database', '', 'User', 'Active'),
(9, 'abc', 'abc@gmail.com', '123', 'Java', NULL, 'User', 'Active'),
(10, 'asd', 'asd@gmail.com', '123', '', '', 'User', 'Active'),
(11, 'Minji', 'minji@gmail.com', '123', '', NULL, 'User', 'Active'),
(12, 'John', 'john@gmail.com', '123', '', NULL, 'User', 'Active'),
(13, 'Ali', 'ali@gmail.com', '123', '', NULL, 'User', 'Active'),
(14, 'Sarah', 'sarah@gmail.com', '123', '', NULL, 'User', 'Active'),
(15, 'Lecturer', 'lecturer@gmail.com', '123', '', NULL, 'Instructor', 'Active'),
(16, 'Admin', 'admin@gmail.com', '123', '', NULL, 'Admin', 'Active'),
(17, 'Minji', 'minji@gmail.com', '123', '', NULL, 'User', 'Active'),
(18, 'John', 'john@gmail.com', '123', '', NULL, 'User', 'Active'),
(19, 'Sarah', 'sarah@gmail.com', '123', '', NULL, 'User', 'Active'),
(20, 'Ali', 'ali@gmail.com', '123', '', NULL, 'User', 'Active'),
(21, 'David', 'david@gmail.com', '123', '', NULL, 'User', 'Active'),
(22, 'Lisa', 'lisa@gmail.com', '123', '', NULL, 'User', 'Active'),
(23, 'Tom', 'tom@gmail.com', '123', '', NULL, 'User', 'Active'),
(24, 'Emma', 'emma@gmail.com', '123', '', NULL, 'User', 'Active'),
(25, 'Kevin', 'kevin@gmail.com', '123', '', NULL, 'User', 'Active'),
(26, 'Rachel', 'rachel@gmail.com', '123', '', NULL, 'User', 'Active'),
(27, 'test123', 'test@gmail.com', '123', '', '', 'User', 'Active'),
(28, '123', '123@gmail.con', '123', '', NULL, 'User', 'Active'),
(29, '123', '1234@gmail.com', '123', '', NULL, 'User', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `user_skills`
--

CREATE TABLE `user_skills` (
  `id` int(11) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `skill_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_skills`
--

INSERT INTO `user_skills` (`id`, `email`, `skill_name`) VALUES
(30, 'minji@gmail.com', 'Java'),
(31, 'minji@gmail.com', 'Database'),
(32, 'minji@gmail.com', 'Networking'),
(33, 'minji@gmail.com', 'Python'),
(34, 'john@gmail.com', 'Java'),
(35, 'john@gmail.com', 'Database'),
(36, 'john@gmail.com', 'Networking'),
(37, 'sarah@gmail.com', 'Java'),
(38, 'sarah@gmail.com', 'Database'),
(39, 'ali@gmail.com', 'Python'),
(40, 'ali@gmail.com', 'Networking'),
(41, 'david@gmail.com', 'Java'),
(42, 'david@gmail.com', 'Python'),
(43, 'david@gmail.com', 'Database'),
(44, 'lisa@gmail.com', 'Networking'),
(45, 'lisa@gmail.com', 'Database'),
(46, 'tom@gmail.com', 'Java'),
(47, 'emma@gmail.com', 'Python'),
(48, 'kevin@gmail.com', 'Java'),
(49, 'kevin@gmail.com', 'Database'),
(50, 'kevin@gmail.com', 'Networking'),
(51, 'kevin@gmail.com', 'Python'),
(52, 'rachel@gmail.com', 'Networking'),
(53, 'rachel@gmail.com', 'Python'),
(56, 'test@gmail.com', 'Java'),
(57, 'test@gmail.com', 'Networking'),
(58, '123@gmail.con', 'Java'),
(59, '123@gmail.con', 'Database'),
(60, '1234@gmail.com', 'Java'),
(61, 'haerin@gmail.com', 'Java'),
(62, 'haerin@gmail.com', 'Database');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `completion_status`
--
ALTER TABLE `completion_status`
  ADD PRIMARY KEY (`status_id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`enrollment_id`);

--
-- Indexes for table `learning_progress`
--
ALTER TABLE `learning_progress`
  ADD PRIMARY KEY (`progress_id`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`materialID`);

--
-- Indexes for table `team_selection`
--
ALTER TABLE `team_selection`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `topic`
--
ALTER TABLE `topic`
  ADD PRIMARY KEY (`topicID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_skills`
--
ALTER TABLE `user_skills`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `completion_status`
--
ALTER TABLE `completion_status`
  MODIFY `status_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `course_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `enrollment`
--
ALTER TABLE `enrollment`
  MODIFY `enrollment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `learning_progress`
--
ALTER TABLE `learning_progress`
  MODIFY `progress_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `materialID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `team_selection`
--
ALTER TABLE `team_selection`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `topic`
--
ALTER TABLE `topic`
  MODIFY `topicID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `user_skills`
--
ALTER TABLE `user_skills`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
