-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 08. Maret 2020 jam 10:08
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `yudistira`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `databuku`
--

CREATE TABLE IF NOT EXISTS `databuku` (
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `PnlsBuku` varchar(50) NOT NULL,
  `ThnTrbtBuku` varchar(5) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `databuku`
--

INSERT INTO `databuku` (`KdBuku`, `JnsBuku`, `JdlBuku`, `PnlsBuku`, `ThnTrbtBuku`, `JmlBuku`) VALUES
('YDS-DB-001', 'Pelajaran Sekolah', 'MATEMATIKA', 'Tim Bina Karya Guru', '2014', '500'),
('YDS-DB-002', 'Anak-anak', 'CERITA RAKYAT NUSANTARA', 'TIMN Efk', '2017', '1000'),
('YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', 'Djoko Purwanto', '2015', '800'),
('YDS-DB-004', 'Fiksi', 'ONE DAY', 'David Nicholls', '2012', '300'),
('YDS-DB-005', 'Non Fiksi', 'BIOLOGI untuk SMA kelas XII', 'Supiyanto', '2007', '400'),
('YDS-DB-006', 'Pelajaran Sekolah', 'KEWARGANEGARAAN', 'BKG for Education', '2006', '500'),
('YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', 'Hindraswari', '2008', '800'),
('YDS-DB-008', 'Pelajaran Sekolah', 'GROW WITH ENGLISH', 'Mukarto', '2011', '1000'),
('YDS-DB-009', 'Perguruan Tinggi', 'PRINSIP-PRINSIP PERANCANGAN TEKNIK', 'Ken Hurst', '2008', '700'),
('YDS-DB-010', 'Referensi', 'ENSIKLOPEDIA 25 NABI DAN RASUL', 'Mohammad Chandra', '2017', '1000'),
('YDS-DB-011', 'Pelajaran Sekolah', 'SEJARAH', 'Joko', '2011', '500');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datakaryawan`
--

CREATE TABLE IF NOT EXISTS `datakaryawan` (
  `NIK` varchar(30) NOT NULL,
  `Nama` varchar(35) NOT NULL,
  `TTL` varchar(25) NOT NULL,
  `Jbtn` varchar(25) NOT NULL,
  `Almt` varchar(50) NOT NULL,
  `NoTelp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datakaryawan`
--

INSERT INTO `datakaryawan` (`NIK`, `Nama`, `TTL`, `Jbtn`, `Almt`, `NoTelp`) VALUES
('YDS-DK-0001', 'Teguh A.S', 'Jakarta, 24 Mei 1979', 'Kepala Cabang', 'Jl. Damai III', '08788991211'),
('YDS-DK-0002', 'Ahmad Marzuki', 'Jakarta, 9 Juni 1985', 'Manager', 'Jl. Pancoran Barat II', '08123434111'),
('YDS-DK-0003', 'Ismadi', 'Bogor, 25 Maret 1980', 'Asisten Manager', 'Jl. Tegal Parang', '08971212901'),
('YDS-DK-0004', 'Ayu Andira ', 'Jakarta, 10 Januari 1983', 'HRD', 'Jl. Kalibata Tengah ', '08121115577'),
('YDS-DK-0005', 'Fitroh', 'Jakarta, 8 Juni 1987', 'Accounting', 'Jl. Pasar Rebo', '08788454511'),
('YDS-DK-0006', 'Yudo Kerti', 'Solo, 11 April 1982', 'Keuangan', 'Jl. Kota Bambu Selatan II', '08783399900'),
('YDS-DK-0007', 'Irwan', 'Jakarta, 7 Mei 1980', 'Penagihan', 'Jl. Lebak Sari', '08567711990'),
('YDS-DK-0008', 'Arifin', 'Jakarta, 20 Maret 1984', 'Gudang', 'Jl. Mampang Prapatan III', '08129991212'),
('YDS-DK-0009', 'Aranda Maulana', 'Jakarta, 8 September 1993', 'ADMIN', 'Jl. Margonda Raya', '08129903312'),
('YDS-DK-0010', 'Roby Setyawan', 'Jakarta, 25 Agustus 1994', 'Gudang', 'Jl. Angsana 1', '08127788123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapelanggan`
--

CREATE TABLE IF NOT EXISTS `datapelanggan` (
  `kdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `EmailPelanggan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapelanggan`
--

INSERT INTO `datapelanggan` (`kdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `EmailPelanggan`) VALUES
('YDS-DP-00001', 'SMAN 25 Jakarta', 'Jl. AM. Sangaji', '021-6331921', 'sma25@_jkt@yahoo.com'),
('YDS-DP-00002', 'SDN 08 Pagi', 'Jl. Pancoran Barat VIII', '021-79188930', 'sdn08pancoran@gmail.com'),
('YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat XIII', '021-7991643', 'info@smpn154jkt.com'),
('YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'www.aksara.com'),
('YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'www.periplus.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapembayaran`
--

CREATE TABLE IF NOT EXISTS `datapembayaran` (
  `NoFaktur` varchar(15) NOT NULL,
  `TglPembayaran` varchar(15) NOT NULL,
  `KdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL,
  `JnsPembayaran` varchar(10) NOT NULL,
  `JnsCicilan` varchar(15) NOT NULL,
  `Angsuran` varchar(100) NOT NULL,
  `TtlPembayaran` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapembayaran`
--

INSERT INTO `datapembayaran` (`NoFaktur`, `TglPembayaran`, `KdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `KdBuku`, `JnsBuku`, `JdlBuku`, `JmlBuku`, `JnsPembayaran`, `JnsCicilan`, `Angsuran`, `TtlPembayaran`) VALUES
('YDS-1001', '2018/6/11', 'YDS-DP-00001', 'SMAN 25 Jakarta', 'Jl. AM. Sangaji', '021-6331921', 'YDS-DB-001', 'Pelajaran Sekolah', 'MATEMATIKA', '300', 'Tunai', 'Select Item', '-', '30000000'),
('YDS-1002', '2018/7/14', 'YDS-DP-00002', 'SDN 08 Pagi', 'Jl. Pancoran Barat VIII', '021-79188930', 'YDS-DB-006', 'Pelajaran Sekolah', 'KEWARGANEGARAAN', '300', 'Tunai', 'Select Item', '-', '30000000'),
('YDS-1003', '2018/7/17', 'YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat XIII', '021-7991643', 'YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', '500', 'Kredit', 'Mingguan', '1', '5000000'),
('YDS-1004', '2018/8/7', 'YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'YDS-DB-002', 'Non Fiksi', 'CERITA RAKYAT NUSANTARA', '800', 'Kredit', 'Bulanan', '1', '10000000'),
('YDS-1005', '2018/8/15', 'YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', '500', 'Kredit', 'Bulanan', '1', '10000000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapemesananbuku`
--

CREATE TABLE IF NOT EXISTS `datapemesananbuku` (
  `KdPemesananBuku` varchar(15) NOT NULL,
  `TglPemesananBuku` varchar(15) NOT NULL,
  `KdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `PnlsBuku` varchar(50) NOT NULL,
  `ThnTrbtBuku` varchar(5) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapemesananbuku`
--

INSERT INTO `datapemesananbuku` (`KdPemesananBuku`, `TglPemesananBuku`, `KdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `KdBuku`, `JnsBuku`, `JdlBuku`, `PnlsBuku`, `ThnTrbtBuku`, `JmlBuku`) VALUES
('YDS-PMB-120', '2018/6/10', 'YDS-DP-00001', 'SMAN 25 Jakarta', 'Jl. AM. Sangaji', '021-6331921', 'YDS-DB-001', 'Pelajaran Sekolah', 'MATEMATIKA', 'Tim Bina Karya Guru', '2014', '300'),
('YDS-PMB-121', '2018/7/13', 'YDS-DP-00002', 'SDN 08 Pagi', 'Jl. Pancoran Barat VIII', '021-79188930', 'YDS-DB-006', 'Pelajaran Sekolah', 'KEWARGANEGARAAN', 'BKG for Education', '2006', '300'),
('YDS-PMB-122', '2018/7/14', 'YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat XIII', '021-7991643', 'YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', 'Hindraswari', '2008', '500'),
('YDS-PMB-123', '2018/8/5', 'YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'YDS-DB-00004', 'Pelajaran Sekolah', 'CERITA RAKYAT NUSANTARA', 'TIMN Efk', '2017', '800'),
('YDS-PMB-124', '2018/8/10', 'YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', 'Djoko Purwanto', '2015', '500');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapenagihan`
--

CREATE TABLE IF NOT EXISTS `datapenagihan` (
  `NoFaktur` varchar(15) NOT NULL,
  `TglJthTempo` varchar(15) NOT NULL,
  `KdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL,
  `TtlPembayaran` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapenagihan`
--

INSERT INTO `datapenagihan` (`NoFaktur`, `TglJthTempo`, `KdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `KdBuku`, `JnsBuku`, `JdlBuku`, `JmlBuku`, `TtlPembayaran`) VALUES
('YDS-1003', '2018/7/2', 'YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat VIII ', '021-7991643', 'YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', '500', '5000000'),
('YDS-1004', '2018/9/1', 'YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'YDS-DB-002', 'Anak-anak', 'CERITA RAKYAT NUSANTARA', '800', '10000000'),
('YDS-1005', '2018/9/1', 'YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', '500', '5000000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapengiriman`
--

CREATE TABLE IF NOT EXISTS `datapengiriman` (
  `NoFaktur` varchar(15) NOT NULL,
  `TglPengiriman` varchar(15) NOT NULL,
  `KdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL,
  `JnsPembayaran` varchar(10) NOT NULL,
  `TtlPengiriman` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapengiriman`
--

INSERT INTO `datapengiriman` (`NoFaktur`, `TglPengiriman`, `KdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `KdBuku`, `JnsBuku`, `JdlBuku`, `JmlBuku`, `JnsPembayaran`, `TtlPengiriman`) VALUES
('YDS-1001', '2018/6/13', 'YDS-DP-00001', 'SMAN 25 Jakarta', 'Jl. AM. Sangaji', '021-6331921', 'YDS-DB-001', 'Pelajaran Sekolah', 'MATEMATIKA', '300', 'Tunai', '1'),
('YDS-1002', '2018/7/18', 'YDS-DP-00002', 'SDN 08 Pagi', 'Jl. Pancoran Barat VIII', '021-79188930', 'YDS-DB-006', 'Pelajaran Sekolah', 'KEWARGANEGARAAN', '300', 'Tunai', '1'),
('YDS-1003', '2018/7/20', 'YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat XIII', '021-7991643', 'YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', '500', 'Kredit', '1'),
('YDS-1004', '2018/8/15', 'YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'YDS-DB-002', 'Select Item', 'CERITA RAKYAT NUSANTARA', '800', 'Kredit', '1'),
('YDS-1005', '2018/8/20', 'YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', '500', 'Kredit', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datapenjualanbuku`
--

CREATE TABLE IF NOT EXISTS `datapenjualanbuku` (
  `NoFaktur` varchar(15) NOT NULL,
  `TglPenjualanBuku` varchar(15) NOT NULL,
  `KdPelanggan` varchar(15) NOT NULL,
  `NmPelanggan` varchar(50) NOT NULL,
  `AlmtPelanggan` varchar(50) NOT NULL,
  `NoTelpPelanggan` varchar(15) NOT NULL,
  `KdBuku` varchar(15) NOT NULL,
  `JnsBuku` varchar(50) NOT NULL,
  `JdlBuku` varchar(100) NOT NULL,
  `PnlsBuku` varchar(50) NOT NULL,
  `ThnTrbtBuku` varchar(5) NOT NULL,
  `JmlBuku` varchar(100) NOT NULL,
  `JnsPembayaran` varchar(10) NOT NULL,
  `TtlPembayaran` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `datapenjualanbuku`
--

INSERT INTO `datapenjualanbuku` (`NoFaktur`, `TglPenjualanBuku`, `KdPelanggan`, `NmPelanggan`, `AlmtPelanggan`, `NoTelpPelanggan`, `KdBuku`, `JnsBuku`, `JdlBuku`, `PnlsBuku`, `ThnTrbtBuku`, `JmlBuku`, `JnsPembayaran`, `TtlPembayaran`) VALUES
('YDS-1001', '2018/6/11', 'YDS-DP-00001', 'SMAN 25 Jakarta', 'Jl. AM. Sangaji', '021-6331921', 'YDS-DB-001', 'Pelajaran Sekolah', 'MATEMATIKA', 'Tim Bina Karya Guru', '2014', '300', 'Tunai', '1'),
('YDS-1002', '2018/7/14', 'YDS-DP-00002', 'SDN 08 Pagi', 'Jl. Pancoran Barat VIII', '021-79188930', 'YDS-DB-006', 'Pelajaran Sekolah', 'KEWARGANEGARAAN', 'BKG for Education', '2006', '300', 'Tunai', '1'),
('YDS-1003', '2018/7/16', 'YDS-DP-00003', 'SMPN 154 Jakarta', 'Jl. Pengadegan Barat XIII', '021-7991643', 'YDS-DB-007', 'Pelajaran Sekolah', 'TEKNOLOGI INFORMASI & KOMUNIKASI', 'Hindraswari', '2008', '500', 'Kredit', '1'),
('YDS-1004', '2018/8/6', 'YDS-DP-00004', 'Toko Buku Aksara', 'Jl. Kemang Raya No. 8B', '021-7199288', 'YDS-DB-002', 'Select Item', 'CERITA RAKYAT NUSANTARA', 'TIMN Efk', '2017', '800', 'Kredit', '1'),
('YDS-1005', '2018/8/11', 'YDS-DP-00005', 'Toko Buku Periplus', 'Jl. Gedung Coloni 6, Jl. Kemang Raya', '021-49773397', 'YDS-DB-003', 'Perguruan Tinggi', 'KOMUNIKASI BISNIS', 'Djoko Purwanto', '2015', '500', 'Kredit', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengguna`
--

CREATE TABLE IF NOT EXISTS `pengguna` (
  `Username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengguna`
--

INSERT INTO `pengguna` (`Username`, `password`) VALUES
('admin', 'admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
