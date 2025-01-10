# Sinema Müşteri Kayıt Sistemi

Sinema Müşteri Kayıt Sistemi, sinema işletmelerinin müşteri, film ve salon bilgilerini yönetmelerine yardımcı olan bir Java uygulamasıdır. Bu uygulama, kullanıcıların yeni müşteri, film ve salon eklemelerine, mevcut kayıtları listelemelerine olanak tanır. Veriler JSON formatında saklanır ve okunur, bu da veri yönetimini kolaylaştırır ve esneklik sağlar.

## Projenin Amacı

Bu projenin amacı, sinema işletmelerinin günlük operasyonlarını daha verimli bir şekilde yönetmelerine yardımcı olmaktır. Müşteri bilgilerini, film gösterimlerini ve salon düzenlemelerini merkezi bir sistemde toplamak, işletmelerin daha iyi hizmet sunmasına olanak tanır. Ayrıca, bu proje Java programlama dilinde nesne yönelimli programlama, dosya işlemleri ve JSON veri formatı kullanımı gibi konularda pratik yapma fırsatı sunar.

## Özellikler

- **Müşteri Yönetimi**: Yeni müşteri ekleme ve mevcut müşterileri listeleme.
- **Film Yönetimi**: Yeni film ekleme ve mevcut filmleri listeleme.
- **Salon Yönetimi**: Yeni salon ekleme ve mevcut salonları listeleme.
- **JSON Desteği**: Veriler JSON formatında saklanır ve okunur, bu da veri yönetimini kolaylaştırır.

## Gereksinimler

- Java 8 veya üstü
- Maven 3.6 veya üstü

## Kurulum

1. **Projeyi Klonlayın**:
    ```bash
    git clone https://github.com/kullaniciadi/sinema-musteri-kayit-sistemi.git
    cd sinema-musteri-kayit-sistemi
    ```

2. **Bağımlılıkları Yükleyin**:
    Maven kullanarak bağımlılıkları yükleyin:
    ```bash
    mvn clean install
    ```

3. **Kullanım**:
    Uygulamayı çalıştırmak için aşağıdaki komutu kullanın:
    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```

### Konsol Menüsü

Uygulama çalıştığında, aşağıdaki seçeneklerle bir konsol menüsü göreceksiniz:

- Yeni Müşteri Ekle
- Müşterileri Listele
- Yeni Film Ekle
- Filmleri Listele
- Yeni Salon Ekle
- Salonları Listele
- Çıkış

Seçiminizi yaparak ilgili işlemleri gerçekleştirebilirsiniz.

## Proje Yapısı
SinemaMusteriKayitSistemi/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/
│   │   │   │   ├── BaseEntity.java
│   │   │   │   ├── Musteri.java
│   │   │   │   ├── Film.java
│   │   │   │   ├── Salon.java
│   │   │   ├── interfaces/
│   │   │   │   ├── IKayit.java
│   │   │   ├── utils/
│   │   │   │   ├── JsonUtil.java
│   │   │   ├── Main.java
│   │   ├── resources/
│   │   │   ├── Musteri.json
│   │   │   ├── Film.json
│   │   │   ├── Salon.json
│
└── README.md


## Geliştirme

Yeni Özellikler Ekleyin: Projeyi genişletmek için yeni özellikler ekleyebilirsiniz. Örneğin, bilet satış sistemi veya raporlama özellikleri.

Testler: JUnit kullanarak birim testler yazabilirsiniz.

## Katkıda Bulunma

Katkıda bulunmak isterseniz, lütfen bir pull request gönderin. Her türlü katkı ve geri bildirim memnuniyetle karşılanır.

## İletişim

Herhangi bir sorunuz veya öneriniz varsa, lütfen `nezir.ayaz@stu.pirireis.edu.tr` adresinden bizimle iletişime geçin.
