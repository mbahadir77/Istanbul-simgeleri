package com.example.stanbulsimgeleriv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.stanbulsimgeleriv1.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Bilgiler> bilgilerArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    bilgilerArrayList = new ArrayList<>();
        Bilgiler ayasofya = new Bilgiler("Ayasofya", "İstanbul", "Ayasofya (anlamı: Kutsal Bilgelik Grekçe: Ἁγία Σοφία, womanize: Agia Sofia), eski adıyla Kutsal Bilgelik Kilisesi ve Ayasofya Müzesi veya günümüzdeki resmî adıyla Ayasofya-i Kebîr Câmi-i Şerîfi (Kutsal Büyük Ayasofya Camii), İstanbul'da yer alan bir cami ve eski bazilika, katedral ve müzedir. Bizans İmparatoru I. Justinianus tarafından, 532-537 yılları arasında İstanbul'un tarihî yarımadasındaki eski şehir merkezine inşa ettirilmiş bazilika planlı bir patrik katedrali olmuştur. 1453 yılında İstanbul'un Osmanlılar tarafından fethedilmesinden sonra II. Mehmed tarafından camiye dönüştürülmüştür. Mustafa Kemal Atatürk tarafından 1934 yılında yayımlanan Bakanlar Kurulu Kararnamesi ile müzeye dönüştürülmüş, kazı ve tadilat çalışmaları başlatılmış ve 1935'ten 2020'ye kadar müze olarak hizmet vermiştir. 2020 yılında ise müze statüsü iptal edilerek cami statüsü verilmiştir. Ayasofya, mimari bakımdan merkezî planı birleştiren kubbeli bazilika tipinde bir yapı olup, kubbe geçişi ve taşıyıcı sistem özellikleriyle mimarlık tarihinde önemli bir dönüm noktası olarak ele alınır. Hristiyanlar için hem sembolik hem de eksen olma anlamının yanında, turistik ve ruhsal bir çekim merkezidir. Ayasofya adındaki aya sözcüğü kutsal anlamına gelir. Sofya sözcüğü ise Grekçede bilgelik anlamındaki sophos sözcüğünden gelir.[6] Dolayısıyla Aya Sofya adı, Nasıralı İsa'ya atfen Kutsal Bilgelik ya da İlahî Bilgelik anlamına gelmekte olup Hristiyan ilahiyatında Tanrı'nın üç niteliğinden biri sayılır.[7][8] Miletli İsidoros ve Trallesli Antemius'un[3][9] yönettiği Ayasofya'nın inşaatında yaklaşık 10.000 işçinin[10][11][12] çalıştığı ve İmparator I. Jüstinyen'in bu iş için büyük bir servet harcadığı belirtilir.[13] Bu çok eski binanın bir özelliği, yapımında kullanılan bazı sütun, kapı ve taşların binadan daha eski yapı ve tapınaklardan getirilmiş olmasıdır.[14][15] Bizans İmparatorluğu döneminde Ayasofya, büyük bir kutsal emanetler zenginliğine sahipti. Bu emanetlerden biri de 15 metre yüksekliğindeki gümüş ikonostasis idi.[16] Konstantinopolis Patriği'nin kilisesi ve Doğu Ortodoks Kilisesi'nin 1000 yıl boyunca merkezi olan Ayasofya, 1054 yılında Patrik I. Mihail'in Papa IX. Leo tarafından aforoz edilmesine şahitlik etmiş olup, bu olay, genel olarak \"Schisma\"nın, yani Hristiyanlık tarihindeki en önemli olaylardan biri olan Doğu ve Batı kiliselerinin ayrılmasının başlangıcı sayılır. 1453 yılında kilise, Osmanlı padişahı II. Mehmed tarafından camiye dönüştürüldükten sonra mozaiklerinden insan figürleri içerenler tahrip edilmemiş (içermeyenlerse olduğu gibi bırakılmıştır), yalnızca ince bir sıvayla kaplanmış ve yüzyıllarca sıva altında kalan mozaikler, bu sayede doğal ve yapay tahribattan kurtulabilmiştir. Cami, müzeye dönüştürülürken sıvaların bir kısmı çıkarılmış ve mozaikler yine gün ışığına çıkarılmıştır. Günümüzde görülen Ayasofya binası, aslında aynı yere üçüncü kez inşa edilen kilise olduğundan \"Üçüncü Ayasofya\" olarak da bilinir. İlk iki kilise isyanlar sırasında yıkılmıştır. Döneminin en geniş kubbesi olan Ayasofya'nın merkezî kubbesi, Bizans döneminde bir kez (7 Mayıs 558 tarihinde) çökmüş,[17][18] Osmanlı başmimarı Mimar Sinan'ın binaya payandaları eklemesinden itibaren de hiç çökmemiştir.",R.drawable.ayasofya);
        Bilgiler Fatihc = new Bilgiler("Fatih Camii", "İstanbul", "Fatih Camii ve Külliyesi, İstanbul'un Fatih ilçesinde II. Mehmed tarafından yaptırılmış olan cami ve külliyedir. Külliye içinde 16 adet medrese, darüşşifa (hastane), tabhane (konukevi) imaret (aşevi), kütüphane ve hamam bulunmaktadır. Şehrin yedi tepesinden birinde inşa edilmiştir. Cami 1766 depreminde yıkıldıktan sonra onarılarak 1771'de bugünkü halini almıştır. 1999 Gölcük Depreminde zemininde kaymalar tespit edilen camide 2008 yılında Vakıflar Genel Müdürlüğü tarafından zemin güçlendirme ve restorasyon çalışmalarına başlandı ve 2012 yılında tekrar ibadete açılmıştır.", R.drawable.fatifc);
        Bilgiler Suleymaniye = new Bilgiler("Süleymaniye Camii", "İstanbul", "Süleymaniye Camii Klasik Osmanlı Mimarisinin en önemli örneklerinden biridir. Yapımından günümüze dek İstanbul'da yüzü aşkın deprem gerçekleşmesine karşın, caminin duvarlarında en ufak bir çatlak oluşmamıştır. Dört fil ayağı üzerine oturan caminin kubbesi 53 m yüksekliğinde ve 27,5 m çapındadır. Bu ana kubbe, Ayasofya'da da görüldüğü gibi, iki yarım kubbe ile desteklenmektedir. Kubbe kasnağında 32 pencere bulunmaktadır. Cami avlusunun dört köşesinde birer minare bulunmaktadır. Bu minarelerin camiye bitişik iki tanesi üçer şerefeli ve 76 m yüksekliğinde, cami avlusunun kuzey köşesinde son cemaat yeri giriş cephesi duvarının köşesinde bulunan diğer iki minare ise ikişer şerefeli ve 56 m yüksekliğindedir. Cami, içindeki kandil islerini temizleyecek hava akımına uygun inşa edilmiştir. Yani cami içinde, yağ lambalarından çıkan islerin tek bir noktada toplanmasını sağlayan bir hava akımı yaratacak şekilde inşa edilmiştir. Camiden çıkan isler ana giriş kapısının üzerindeki odada toplanmış ve bu isler mürekkep yapımında kullanılmıştır. Fil ayağı destekli ana ve destek kubbeleri 28 revakın çevrelediği cami avlusunun ortasında dikdörtgen şeklinde bir şadırvan bulunmaktadır. Caminin kıble tarafında içinde Kanuni Sultan Süleyman'ın ve eşi Hürrem Sultan'ın bulunduğu bir hazire mevcuttur. Kanuni Sultan Süleyman'ın türbesinin kubbesi yıldızlarla donanmış gökyüzü imajını vermesi için, içeriden, metalik plakalar arasına yerleştirilmiş pırlantalarla (elmaslarla) süslenmiştir. Cami süslemeleri açısından sade bir yapıya sahiptir. Mihrap duvarındaki pencereler vitraylarla süslüdür. Mihrabın iki tarafındaki pencereler üzerinde yer alan çini madalyonlarda Fetih Suresi, caminin ana kubbesinin ortasında ise Nur Suresi yazılı bulunmaktadır. Caminin hattatı Hasan Çelebi'dir. Süleymaniye camiinin 4 minaresi vardır.[3] Bunun nedeni Kanuni'nin İstanbul'un fethinden sonraki dördüncü padişah; bu dört minaredeki on şerefinin de Osmanlının onuncu padişahı olduğunun bir işaretidir. Osmanlı külliyeleri içinde Fatih külliyesinden sonra ikinci büyük külliye Süleymaniye külliyesidir. Külliye İstanbul yarımadasının Haliç, Marmara, Topkapı Sarayı ve Boğaziçi'ni gören ortadaki en yüksek tepesinde inşa edilmiştir. Cami, medreseler, darüşşifa, darülhadis, çeşme, darülkurra, darüzziyafe, imaret, hamam, tabhane, kütüphane ve dükkânlardan meydana gelen külliyede Mimar Sinan'ın türbesi dış avlu duvarlarının karşısında mütevazı küçük bir yapıdır. Tiryakiler Çarşısı'nı iki medrese çevreler, arkasındaki yolda iki küçük ev vardır. \"Tiryakiler Çarşısı adını taşıyan ince uzun meydanın bir cephesini oluşturan ufki tek katlı medreselerde, her kubbenin alatında bir pencereyle belirlenen iç odaların imaretleri, aza razı bir zahit tavrı içindeki cephesi, Mimar Sultan Külliyesi'ndeki medrese duvarı pencerelerinin ve kubbe dizilerinin tezyini düzenini hatırlatır\" Anakubbenin kemeri, Sinan tarafından kemeri kübra,(kudret kemeri) diye adlandırılmıştır. Cami avlusunun platformu, Haliç tarafındaki yoldan yüksektedir.", R.drawable.suleymaniye);

        bilgilerArrayList.add(ayasofya);
        bilgilerArrayList.add(Suleymaniye);
        bilgilerArrayList.add(Fatihc);

        //binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Adapter adapter = new Adapter(bilgilerArrayList);
        //binding.RecyclerView.setAdapter(adapter);

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,bilgilerArrayList.stream().map(bilgiler-> bilgiler.isim).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetaylarActivity.class);
                intent.putExtra("Bilgiler", bilgilerArrayList.get(i));
                startActivity(intent);

            }
        });

    }

}

