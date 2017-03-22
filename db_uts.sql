-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 22, 2017 at 08:56 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uts`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_login`
--

CREATE TABLE `tb_login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_login`
--

INSERT INTO `tb_login` (`username`, `password`) VALUES
('grandis', '17'),
('grandis', '17');

-- --------------------------------------------------------

--
-- Table structure for table `tb_peminjam`
--

CREATE TABLE `tb_peminjam` (
  `No Anggota` int(12) NOT NULL,
  `Nama Peminjam` varchar(50) NOT NULL,
  `Alamat Peminjam` text NOT NULL,
  `Jenis Buku` varchar(50) NOT NULL,
  `Judul Buku` varchar(50) NOT NULL,
  `Tanggal Pinjam` date NOT NULL,
  `Tanggal Kembali` date NOT NULL,
  `Denda` int(12) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_peminjam`
--

INSERT INTO `tb_peminjam` (`No Anggota`, `Nama Peminjam`, `Alamat Peminjam`, `Jenis Buku`, `Judul Buku`, `Tanggal Pinjam`, `Tanggal Kembali`, `Denda`, `Status`) VALUES
(123478, 'Abyaz', 'Sidoarjo ', 'Pengetahuan Umum', 'Cara Merawat Kucing', '2015-09-04', '2016-04-09', 0, 'Kembali'),
(143786, 'Grandis', 'Jl. Sidomulyo Kepanjen', 'Novel', 'Our Stars', '2015-08-08', '2016-08-08', 0, 'Kembali'),
(143788, 'Rufaidah', 'Kepanjen', 'Pelajaran', 'Belajar PBO', '2016-04-09', '2016-09-04', 0, 'Kembali'),
(1236789, 'Arzu', 'Jl. Pandji Kepanjen', 'Novel', 'Hujan', '2016-08-09', '2016-09-08', 0, 'Kembali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  ADD PRIMARY KEY (`No Anggota`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  MODIFY `No Anggota` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1897023;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
