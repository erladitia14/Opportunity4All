-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Des 2023 pada 09.11
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jobportal`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `campaign`
--

CREATE TABLE `campaign` (
  `Id_campaign` int(10) NOT NULL,
  `id_comp` int(10) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Deskripsi` text NOT NULL,
  `Location` varchar(150) NOT NULL,
  `Sallary` varchar(100) NOT NULL,
  `Hour` enum('Full','Half','Internship') NOT NULL,
  `pendidikan` varchar(150) NOT NULL,
  `pekerjaan` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `campaign`
--

INSERT INTO `campaign` (`Id_campaign`, `id_comp`, `Name`, `Deskripsi`, `Location`, `Sallary`, `Hour`, `pendidikan`, `pekerjaan`) VALUES
(1, 3, 'Dosen Program Studi PSTI', 'Pendidikan Sistem dan Teknologi infomasi merupakan prodi yang ada di Universitas Pendidikan Indonesia kampus Purwakarta', 'Purwakarta', 'Rp.7.000.000,-', 'Full', 'Minimal s2', 'Minimal 5 tahun jadi dosen'),
(2, 1, 'Staff Akademik', 'Mengelola nilai ujian mahasiswa', 'Banjaran', 'Rp.8.000.000,-', 'Full', 'Minimal pendidikan SMA', 'Minimal 1 tahun pengalaman kerja '),
(3, 2, 'Pengumpul Donasi', 'Mengumpulkan donasi', 'Beringin', 'Rp.9.000.000,-', 'Internship', '-', '-'),
(4, 3, 'Software Development', 'Mengerjakan Project PBO sendirian', 'UPI PWK', 'TERIMA KASIH', 'Full', 'PSTI', '-'),
(5, 1, 'Web Developer', 'Mengerjakan Project Promnet', 'Purwakarta', 'Terima Kasih', 'Full', 'PSTI', 'Pemrograman Internet'),
(7, 1, 'Asisten Observasi', 'Mengajar Madrasah SMP', 'Purwakarta', 'Sertifikat', 'Half', 'Minimal pendidikan PSTI', 'Lulus pengaderan Manpro'),
(8, 2, 'Eco Life', 'Memberikan pelayanan pada user melalui aplikasi', 'Purwakarta', 'Rp.3.500.000,-', 'Half', 'Minimal S1', 'Minimal 1 Admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `company`
--

CREATE TABLE `company` (
  `Id_company` int(10) NOT NULL,
  `Username_company` varchar(150) NOT NULL,
  `Password_company` varchar(150) NOT NULL,
  `Name` varchar(150) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Deskripsi` text DEFAULT NULL,
  `Location` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `company`
--

INSERT INTO `company` (`Id_company`, `Username_company`, `Password_company`, `Name`, `Email`, `Deskripsi`, `Location`) VALUES
(1, 'UPIEDUN', 'ISMYDREAM', 'Universitas Pendidikan Indonesia', 'upiedun@upi.edu', 'Universitas Pendidikan Indonesia memiliki visi, misi, dan tujuan yang sejalan dengan arah pengembangan, jati diri, dan tantangan di masa depan. Visi yang dimiliki UPI adalah “Pelopor dan Unggul (Leading and Outstanding).”', 'Bandung'),
(2, '911Food', 'Naspad', 'Tanpa Kelaparan', '911Food@gmail.com', 'Membertantas Kelaparan', 'Purwakarta'),
(3, 'fmway', 'fmway', 'fikri', 'fmway@gmail.com', 'yaudah', 'Cilacap');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jobseeker`
--

CREATE TABLE `jobseeker` (
  `Id_jobseeker` int(10) NOT NULL,
  `Username_seeker` varchar(150) NOT NULL,
  `Password_seeker` varchar(150) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `PhoneNumber` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `jobseeker`
--

INSERT INTO `jobseeker` (`Id_jobseeker`, `Username_seeker`, `Password_seeker`, `Name`, `Email`, `Address`, `PhoneNumber`) VALUES
(1, 'erladitia', 'erladitia', 'Erlangga Aditia', 'erladitia@gmail.com', 'Cikampek, Karawang', '081280876859'),
(4, 'olif', 'olaf123', 'Annisa Nur', 'olifnur@upi.edu', 'Cibening, Purwakarta', '082748563542'),
(5, 'a', 'a', 'Fikri Azzahra', 'angga@gmail.com', 'Banjaran', '081280866859'),
(6, 'lana', 'is', 'isfalana', 'isfalana@gmail.com', 'Beringin', NULL),
(7, 'o', 'o', 'olip', 'olip312@gmail.com', 'Beringin', NULL),
(8, 'isfa', 'is', 'isfalana', 'isfalana@gmail.com', 'Beringin', NULL),
(9, 'namaku1801', '123', 'Mohamad ', 'nam@aku.com', 'beringin', NULL),
(10, 'hikmatkaka', 'pass', 'Hikmat Mustofa', 'hikmat@upi.edu', 'Purwakarta', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `registed_campaign`
--

CREATE TABLE `registed_campaign` (
  `id` int(11) NOT NULL,
  `id_seeker` int(10) NOT NULL,
  `id_camp` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `registed_campaign`
--

INSERT INTO `registed_campaign` (`id`, `id_seeker`, `id_camp`) VALUES
(1, 1, 1),
(2, 4, 1),
(4, 1, 2),
(5, 5, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `seeker_education`
--

CREATE TABLE `seeker_education` (
  `id_education` int(11) NOT NULL,
  `Institusi` varchar(150) NOT NULL,
  `Deskripsi` text NOT NULL,
  `Lulus` date NOT NULL,
  `Studi` varchar(100) NOT NULL,
  `Nilai` int(3) NOT NULL,
  `id_seeker` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `seeker_education`
--

INSERT INTO `seeker_education` (`id_education`, `Institusi`, `Deskripsi`, `Lulus`, `Studi`, `Nilai`, `id_seeker`) VALUES
(1, 'SMAN 1 CIKAMPEK', 'Tidur', '2023-12-01', 'Ilmu Pengetahuan Alam', 88, 1),
(2, 'SMAN IT Alfidaa', 'Islam Terpadu', '2023-12-02', 'Ilmu Penetahuan Alam', 90, 4),
(6, 'UPI', 'Mhs', '2023-12-01', 'PSTI', 90, 1),
(9, 'Universitas Pendidikan Indonesia Kampus Purwakarta', 'Ada ada saja', '2023-12-12', 'Pendidikan Sistem dan Teknologi Informasi	', 35, 9),
(11, 'upi', 'oke', '2023-12-12', 'psti', 50, 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `seeker_work`
--

CREATE TABLE `seeker_work` (
  `id_work` int(10) NOT NULL,
  `jabatan` varchar(150) NOT NULL,
  `tahun_mulai` date NOT NULL,
  `tahun_selesai` date NOT NULL,
  `nama_pt` varchar(150) NOT NULL,
  `deskripsi` text NOT NULL,
  `id_seeker_work` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `seeker_work`
--

INSERT INTO `seeker_work` (`id_work`, `jabatan`, `tahun_mulai`, `tahun_selesai`, `nama_pt`, `deskripsi`, `id_seeker_work`) VALUES
(1, 'Dosen', '2023-10-01', '2023-10-03', 'Universitas Pendidikan indonesia', 'Ngajar', 1),
(2, 'Marbot', '2022-10-05', '2023-10-01', 'Al-furqon', 'Membersihkan Masjid', 4);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `campaign`
--
ALTER TABLE `campaign`
  ADD PRIMARY KEY (`Id_campaign`),
  ADD KEY `id_comp` (`id_comp`);

--
-- Indeks untuk tabel `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`Id_company`);

--
-- Indeks untuk tabel `jobseeker`
--
ALTER TABLE `jobseeker`
  ADD PRIMARY KEY (`Id_jobseeker`);

--
-- Indeks untuk tabel `registed_campaign`
--
ALTER TABLE `registed_campaign`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_camp` (`id_camp`),
  ADD KEY `id_seeker` (`id_seeker`);

--
-- Indeks untuk tabel `seeker_education`
--
ALTER TABLE `seeker_education`
  ADD PRIMARY KEY (`id_education`),
  ADD KEY `id_seeker` (`id_seeker`) USING BTREE;

--
-- Indeks untuk tabel `seeker_work`
--
ALTER TABLE `seeker_work`
  ADD PRIMARY KEY (`id_work`),
  ADD KEY `id_seeker_work` (`id_seeker_work`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `campaign`
--
ALTER TABLE `campaign`
  MODIFY `Id_campaign` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `company`
--
ALTER TABLE `company`
  MODIFY `Id_company` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `jobseeker`
--
ALTER TABLE `jobseeker`
  MODIFY `Id_jobseeker` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `registed_campaign`
--
ALTER TABLE `registed_campaign`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `seeker_education`
--
ALTER TABLE `seeker_education`
  MODIFY `id_education` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `seeker_work`
--
ALTER TABLE `seeker_work`
  MODIFY `id_work` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `campaign`
--
ALTER TABLE `campaign`
  ADD CONSTRAINT `campaign_ibfk_1` FOREIGN KEY (`id_comp`) REFERENCES `company` (`Id_company`);

--
-- Ketidakleluasaan untuk tabel `registed_campaign`
--
ALTER TABLE `registed_campaign`
  ADD CONSTRAINT `registed_campaign_ibfk_1` FOREIGN KEY (`id_camp`) REFERENCES `campaign` (`Id_campaign`),
  ADD CONSTRAINT `registed_campaign_ibfk_2` FOREIGN KEY (`id_seeker`) REFERENCES `jobseeker` (`Id_jobseeker`);

--
-- Ketidakleluasaan untuk tabel `seeker_education`
--
ALTER TABLE `seeker_education`
  ADD CONSTRAINT `seeker_education_ibfk_1` FOREIGN KEY (`id_seeker`) REFERENCES `jobseeker` (`Id_jobseeker`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `seeker_work`
--
ALTER TABLE `seeker_work`
  ADD CONSTRAINT `id_seeker` FOREIGN KEY (`id_seeker_work`) REFERENCES `jobseeker` (`Id_jobseeker`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
