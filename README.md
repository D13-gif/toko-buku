## 🧾 **Tujuan Proyek**

Sistem ini digunakan untuk mencatat dan memproses transaksi pembelian alat tulis oleh dua jenis pelanggan: **pelanggan tetap** dan **bukan pelanggan tetap**. Sistem ini menghitung total pembayaran berdasarkan jenis pelanggan dan barang yang dibeli, lalu mencetak struk (receipt).

---

## 🗂️ **Struktur Kelas**

### 1. `alattulis.java`

* **Fungsi:** Mewakili data barang (alat tulis) yang dibeli.
* **Atribut:**

  * `namaBarang`: Nama barang.
  * `hargaBarang`: Harga per unit.
  * `jumlah`: Jumlah barang yang dibeli.
* **Metode:**

  * Konstruktor untuk inisialisasi data.
  * Getter untuk mengambil nama, harga, dan jumlah.
  * `getTotalHarga()`: Menghitung total harga (harga \* jumlah).

---

### 2. `pelanggan.java` (Super Class)

* **Fungsi:** Representasi umum pelanggan.
* **Atribut:**

  * `nama`: Nama pelanggan.
  * `daftarBelanja`: ArrayList alat tulis yang dibeli.
* **Metode:**

  * Menambahkan barang ke daftar belanja.
  * Mengambil nama pelanggan.
  * Mengambil daftar belanja.
  * `hitungTotalPembayaran()`: **(Abstract atau Overridable)** — dihitung di subclass.

---

### 3. `pelanggantetap.java` (Subclass dari `pelanggan`)

* **Fungsi:** Mewakili pelanggan yang mendapatkan **diskon**.
* **Metode:**

  * Override `hitungTotalPembayaran()`: Menghitung total dengan potongan (diskon tetap, misalnya 10%).

---

### 4. `bukanpelanggantetap.java` (Subclass dari `pelanggan`)

* **Fungsi:** Mewakili pelanggan biasa yang **tidak mendapat diskon**.
* **Metode:**

  * Override `hitungTotalPembayaran()`: Mengembalikan total belanja tanpa diskon.

---

### 5. `Receipt.java`

* **Fungsi:** Mencetak struk (nota) pembelian.
* **Fungsi utama:**

  * Menerima objek `pelanggan`.
  * Menampilkan daftar barang yang dibeli.
  * Menampilkan total yang harus dibayar.
  * Membedakan antara pelanggan tetap dan bukan pelanggan tetap saat mencetak total.

---

## 🔁 **Alur Program**

1. **Pelanggan dibuat**: Objek pelanggan (tetap atau tidak) dibuat dan diberi nama.
2. **Barang ditambahkan** ke pelanggan melalui `daftarBelanja`.
3. **Total pembayaran dihitung**, dengan atau tanpa diskon tergantung jenis pelanggan.
4. **Receipt dicetak** menggunakan kelas `Receipt`.

---

## 📌 Contoh Skenario Penggunaan

```java
pelanggantetap pt = new pelanggantetap("Ani");
pt.tambahBarang(new alattulis("Pulpen", 2000, 5));
Receipt cetak = new Receipt();
cetak.cetakStruk(pt);
```

---

## 🧩 **Fitur Utama Proyek**

### ✅ 1. **Manajemen Pelanggan**

* Mendukung dua jenis pelanggan:

  * **Pelanggan Tetap** – mendapatkan diskon otomatis.
  * **Bukan Pelanggan Tetap** – membayar penuh tanpa potongan.
* Penyimpanan nama pelanggan.
* Polimorfisme digunakan untuk membedakan perilaku perhitungan pembayaran.

### ✅ 2. **Pengelolaan Barang (Alat Tulis)**

* Menambahkan data barang:

  * Nama barang
  * Harga per unit
  * Jumlah pembelian
* Perhitungan otomatis total harga per barang.

### ✅ 3. **Perhitungan Total Pembayaran**

* Total harga dihitung berdasarkan seluruh daftar barang yang dibeli pelanggan.
* Khusus pelanggan tetap, sistem menghitung **diskon otomatis** (misal 10%).

### ✅ 4. **Pencetakan Struk Pembelian (Receipt)**

* Menampilkan daftar barang:

  * Nama
  * Harga satuan
  * Jumlah
  * Subtotal
* Menampilkan total pembayaran akhir (dengan atau tanpa diskon).
* Format output yang mudah dibaca, cocok untuk keperluan cetak atau laporan transaksi.

### ✅ 5. **Pemanfaatan OOP (Object-Oriented Programming)**

* **Enkapsulasi**: Mengamankan data dalam class.
* **Inheritance**: `pelanggantetap` dan `bukanpelanggantetap` mewarisi dari `pelanggan`.
* **Polymorphism**: Metode `hitungTotalPembayaran()` berbeda sesuai jenis pelanggan.
* **Modularitas**: Setiap class memiliki tanggung jawab spesifik, membuat kode lebih rapi dan mudah dikembangkan.

---

## 🗂️ **Struktur Class Singkat**

| Class                 | Fungsi Utama                                              |
| --------------------- | --------------------------------------------------------- |
| `alattulis`           | Mewakili barang (nama, harga, jumlah, total per item)     |
| `pelanggan`           | Class induk pelanggan, menyimpan nama dan daftar belanja  |
| `pelanggantetap`      | Pelanggan yang mendapat diskon pada total pembelian       |
| `bukanpelanggantetap` | Pelanggan biasa, membayar penuh tanpa diskon              |
| `Receipt`             | Mencetak dan menampilkan struk berdasarkan data pelanggan |

---

## 🧪 **Contoh Hasil Output**

```
Struk Belanja Pelanggan: Ani (Pelanggan Tetap)
--------------------------------------------------
Barang         Harga   Jumlah   Subtotal
Pulpen         2000    5        10000
Penghapus      1000    2        2000
--------------------------------------------------
Diskon: 10%
Total Pembayaran: 10800
```

---

