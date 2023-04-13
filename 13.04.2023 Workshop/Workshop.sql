-- SELECT SECTİON START 

-- Müşteri tablosundaki tüm verileri getirir.
Select * from customers
-- Müşteri tablosundaki Şehir alanını seçer.
Select City from customers
-- Distincttekrarlanan verileri getirmemeye yarar
-- Müşteri tablosundaki Şehir alanında tekrarlanan veri varsa onu seçmez diğerlerini getirir.
Select Distinct City from customers

-- SELECT SECTİON END

-- WHERE SECTİON START 

-- Müşteri tablosundaki şehiri 'Berlin' olan verileri seçer.
Select * from customers Where City ='Berlin'
-- Müşteri tablosundaki şehiri 'Berlin' olan veriler hariç bütün verileri seçer.
Select * from customers Where not City ='Berlin'
-- Müşteri tablosundaki Id'si 'ANATR' olan veriyi seçer.
Select * from customers Where customer_id ='ANATR'
-- Müşteri tablosundaki şehiri 'México D.F.' olan ve posta kodu '05022' olan verileri seçer.
Select * from customers Where City ='México D.F.' and postal_code ='05022'
-- Müşteri tablosundaki şehiri 'Berlin' olan veya posta kodu '05022' olan verileri seçer.
Select * from customers Where City ='Berlin' or postal_code ='05022'

-- WHERE SECTİON END


-- ORDER BY SECTİON START 

-- Müşteri tablosundaki şehir adına göre A-Z ye göre sıralar.
Select * from customers order by city
-- Müşteri tablosundaki şehir adına göre Z-A ye göre sıralar.
Select * from customers order by city DESC
-- Müşteri tablosundaki şehir ve ülke adına göre A-Z ye göre sıralar.
Select * from customers order by city, country

-- ORDER BY SECTİON END

-- INSERT SECTİON START 

-- Category Tablosuna 250 ve 251 id ye sahip deneme1 ve deneme2  kategorilerini ekler.
Insert into categories (category_id, category_name) values (253,'Etiya');
Insert into categories (category_id, category_name) values (252,'Efe');

-- INSERT SECTİON END

-- NULL SECTİON START 

-- Müşteri Tablosunda posta kodu alanı boş olanı getirir.
Select * from customers Where postal_code is null
-- Müşteri Tablosunda posta kodu alanı boş olmayanları getirir.
Select * from customers Where postal_code is not null

-- NULL SECTİON END

-- UPDATE SECTİON START 

-- Kategori tablosunda bütün kategori adlarını 'deneme234' olarak günceller.
Update categories set category_name = 'deneme234'
-- Kategori tablosunda 'Efe' kategorisini  'Efe Denizer' olarak günceller.
Update categories set category_name = 'Efe Denizer' Where category_name='Efe'
-- Kategori tablosunda 253 id ye sahip kategorinin adını  'Efe Denizer' ve açıklamasını 'deneme' olarak günceller.
Update categories set category_name = 'Etiya akademi', description='deneme' Where category_id=253

-- UPDATE SECTİON END 

-- DELETE SECTİON START 

-- Kategori tablosundan 252 id'ye sahip veriyi siler.
Delete from categories Where category_id=253
-- Kategori tablosundaki tüm verileri siler.
-- Lakin ilişkili bir tablo olduğu için hata verecektir.
Delete from categories

-- DELETE SECTİON END

-- LIKE SECTİON START 

 -- Müşteri tablosunda şehir adında 'S' ile başlayan verileri seçer.
 Select * from customers Where City Like 'S%'
  -- Müşteri tablosunda şehir adında 'o' ile biten verileri seçer.
 Select * from customers Where City Like '%o'
   -- Müşteri tablosunda şehir adında 'a' harfi içeren verileri seçer.
 Select * from customers Where City Like '%a%'
  -- Müşteri tablosunda şehir adında 'S' ile başlayıp 'o' ile biten verileri seçer.
 Select * from customers Where City Like 'S%o'
  -- Müşteri tablosunda şehir adında 'S' ile başlamayan verileri seçer.
 Select * from customers Where City NOT Like 'S%'
 
 -- LIKE SECTİON END
 
 -- WİLDCARDS SECTİON START 
 
  -- Müşteri tablosunda şehir adında ikinci harfinde a içeren verileri seçer.
  Select * from customers Where City Like '_a%'
  -- Müşteri tablosunda şirket adı verisinde a veya c veya s ile başlayan verileri seçer.
  Select * from customers Where company_name Like '[acs]%'
   -- Müşteri tablosunda şirket adı verisinde a veya c veya s ile başlamayan verileri seçer.
  Select * from customers Where company_name Like '[!acs]%'
     -- Müşteri tablosunda şirket adı verisinde a'dan c ye kadar olan harfler ile başlayan verileri seçer.
  Select * from customers Where company_name Like '[a-c]%'
  
 -- WİLDCARDS SECTİON END
   
 -- IN SECTİON START 
   
 -- Çalışanlar tablosunda ünvanı Mr. ve Dr. olan verileri getir
 Select * from employees Where title_of_courtesy in ('Mr.', 'Dr.')
 -- Çalışanlar tablosunda ünvanı Mr. olanmayan verileri getir
 Select * from employees Where title_of_courtesy not in ('Mr.')
   
   -- IN SECTİON END
	
  -- BETWEEN SECTİON START
  
  -- Ürünler tablosundaki ürünlerin birim fiyatı 10 ile 30 arasında olan verileri getir.
  Select * from products Where unit_price Between 10 and 30
  -- Ürünler tablosundaki ürünlerin birim fiyatı 10 ile 80 arasında olmayan verileri getir.
  Select * from products Where unit_price Not Between 10 and 80
  -- Ürünler tablosundaki ürünlerin ürün adı 'Chai' ile 'Tunnbröd' arasında olan verileri getir.
  -- Bunu yaparken alfabaye göre gider.
  Select * from products Where product_name Between 'Chai' and 'Tunnbröd'
  
  -- BETWEEN SECTİON END
  
  -- ALİAS SECTİON START
  
  --as takma isim vermeye yarar ve sorgu sonucu dönen veriye isim verebilirsiniz.
  -- biz burda farklı ülkeden gelen çalışan sayısını bulan sorgu yazdık ve isim verdik.
  Select Count( Distinct country) as "FFarklı ülkeden gelen çalışan sayısı" from employees
  -- Burada ise javadaki stream metodu sayesinde filtreleme yaptığımız c# da linq olarak geçen bir yapı
  -- ürünler tablosuna p ismi verdik artık p yazdımızda ürünler tablosnu simgeler duruma geldi.
  Select p.product_id, p.product_name from products p
  
  -- ALİAS SECTİON END 
  
  -- GROUP BY SECTİON START
  
  -- Sipariş Tablosunda geminin via'sına göre gruplandırıp bu gruplar içindeki ağırlıkları toplayıp seçme işlemi yaptık.
  Select Count(freight) from orders Group by ship_via 
    -- geminin via'sına göre gruplandırıp bu gruplar içindeki ağırlıkları toplayıp idlerine göre sıralayıp 
	-- seçme işlemi yaptık.
  Select Count(freight) from orders Group by ship_via Order by Count(order_id)
  
  -- GROUP BY SECTİON END
  
  -- JOİN SECTİON START 
  
  -- kategori tablosunda kategori adı ve ürünlerde id ürün adı ve birim fiyat alanlarını alıp kategori id alanları 
  -- eşit ise kesişen alanı bana ver dedik
  Select p.product_id,p.product_name,p.unit_price, c.category_name from products p inner join categories c 
  On c.category_id = p.category_id
  
  
   -- kategori tablosunda kategori adı ve ürünlerde id ürün adı ve birim fiyat alanlarını alıp kategori id alanları 
  -- eşit ise ilk tablonun hepsini al bide kesişen alanı bana ver dedik
  Select p.product_id,p.product_name,p.unit_price, c.category_name from products p left join categories c 
  On c.category_id = p.category_id
  
   -- Kategori tablosundaki alanları ve ürün tablosundaki alanları al kategori id alanları 
  -- eşit ise ikinci tablonun hepsini al bide kesişen alanı bana ver dedik
  Select * from products p Right join categories c On c.category_id = p.category_id
  
  -- JOİN SECTİON END 
  
  
  -- DATABASE SECTİON START 
  
  -- Deneme adında veritabanı oluşturur.
  Create Database Deneme
   -- Deneme veritabanını siler.
  Drop Database Deneme
  
  
  
  -- Hesap tablosu oluşturur ve içine kolonların ismini ve özelliklerini veririz 
CREATE TABLE accounts (
	user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL,
    last_login TIMESTAMP 
);

  -- Tabloyu hesap tablosunu siler 
  Drop table accounts
  
  -- tablodaki tüm verileri siler 
  Truncate table accounts
  
  -- bölge adlı tablodan  text tipinde yeni bir kolon ekler 
  Alter table region add Deneme text
  -- bölge tablosundan  deneme adlı kolonu siler 
  Alter table region drop column Deneme
  
  -- DATABASE SECTİON END 
  