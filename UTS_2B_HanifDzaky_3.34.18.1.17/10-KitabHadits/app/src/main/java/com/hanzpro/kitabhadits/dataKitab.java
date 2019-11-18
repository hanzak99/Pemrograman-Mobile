package com.hanzpro.kitabhadits;

import java.util.ArrayList;

public class dataKitab {
    public static String[][] data = new String[][] {
            {"0","KITAB SHAHIH BUKHARI", "Orang pertama yang memiliki perhatian untuk mengumpulkan hadits-hadits shahih secara khusus adalah Abu Abdillah Muhammad bin Isma’il Al Bukhari (Imam Al Bukhari) dan diikuti oleh sahabat sekaligus muridnya, Abul Husain Muslim bin Al Hajjaj An Naisaburi (Imam Muslim). Shahih Bukhari adalah kitab hadits yang paling shahih. Ibnu Shalah mengatakan bahwa hadits shahih dalam Shahih Al Bukhari berjumlah 7275 hadits dengan pengulangan. Jika tanpa pengulangan berjumlah 4000 hadits. ", "https://i.postimg.cc/hvNTbVWm/shahih-bukhari.jpg"},
            {"1","KITAB SHAHIH MUSLIM", "Shahih Muslim ditulis oleh Abul Husain Muslim bin Al Hajjaj An Naisaburi (Imam Muslim). Jumlah hadits dalam shahih Muslim tanpa perulangan berjumlahan sekitar 4000 hadits. ", "https://i.postimg.cc/D0S1XBDF/shahih-muslim.jpg"},
            {"2","KITAB SUNAN ABU DAUD", "Sunan Abu Dawud merupakan kitab koleksi hadis yang disusun oleh Imam Abu Dawud, merupakan salah satu dari Kutubut Tis'ah. Sunan Abu Dawud terbagi menjadi beberapa kitab di mana tiap kitab terdiri dari beberapa bab. Beberapa judul bab menunjukkan fiqih Imam Abu Dawud terhadap hadis-hadis yang termuat di dalamnya. ", "https://i.postimg.cc/2jtQDNb5/sunan-abi-daud.jpg"},
            {"3","KITAB SUNAN IBNU MAJAH", "Sunan ibnu Majah adalah kitab kumpulan Hadis dalam Islam yang disusun oleh ibnu Majah. Kitab ini adalah salah satu dari enam kitab yang menjadi rujukan utama bagi pemeluk Islam. Kitab ini menghimpun kurang lebih 4000 hadis yang terpisah kedalam 32 buku. ", "https://i.postimg.cc/G27ktZXq/sunan-ibnu-majah.jpg"},
            {"4","KITAB SUNAN AN-NASA'I", "Kitab hadits ini merupakan buku yang diterjemahkan dari salah satu enam kitab pokok dalam bidang hadits (kutubussittah), yaitu kitab Sunan an-Nasa’i. Disusun oleh al-imam, al-Hafidzh, ats-Tasbt, Naqidul Hadits (Kritikus Hadits), an-Nasa’i (w. 303 H). Sebagaimana  kitab sunan yang lainnya, buku kumpulan hadits ini disusun berdasarkan tema-tema fiqih (abwabul fiqih) Kitab ini memuat kumpulan hadits yang terdiri dari masalah ibadah hingga masalah muamalah ", "https://i.postimg.cc/TPcjMyg8/sunan-an-nasai.jpg"},
            {"5","KITAB SUNAN AT-TIRMIDZI", "Jami at-Tirmidzi atau lebih dikenal dengan Sunan at-Tirmidzi adalah kitab kumpulan Hadits dalam Islam yang disusun oleh Tirmidzi. Kitab ini adalah yang terakhir di antara enam kitab rujukan utama hadits sesuai dengan urutan prioritasnya ", "https://i.postimg.cc/sgd5MPJd/sunan-at-tirmidzi.jpg"},
            {"6","KITAB MUSNAD IMAM AHMAD", "Musnad Ahmad atau ringkasnya dikenali sebagai al-Musnad adalah salah satu kitab hadis Nabi yang terkenal dan terluas, dan kedudukannya menempati posisi yang diutamakan di kalangan Ahlus Sunnah sebagai induk rujukan.", "https://i.postimg.cc/SKm8ry5g/musnad-imam-ahmad.jpg"},
            {"7","KITAB BULUGHUL MARAM", "Bulughul Maram atau Bulugh al-Maram min Adillat al-Ahkam, disusun oleh Al-Hafizh Ibnu Hajar Al-Asqalani. Kitab ini merupakan kitab hadis tematik yang memuat hadis-hadis yang dijadikan sumber pengambilan hukum fikih oleh para ahli fikih. Kitab ini menjadi rujukan utama khususnya bagi fikih dari Mazhab Syafi'i.", "https://i.postimg.cc/Z58pp9f9/bulugul-maram.jpg"},
            {"8","KITAB UMDATUL AHKAM", "’Umdatul Ahkam atau lengkapnya ’Umdat al-Ahkaam min Kalaami Khairi al-Anaam adalah kitab fikih yang dikarang oleh Al-Hafizh Abdul Ghani al-Maqdisi. Kitab ini termasuk di antara kitab rujukan utama di dalam bidang fikih ibadah", "https://i.postimg.cc/Hk93HP1P/umdatul-ahkam.jpg"},
            {"9","KITAB ARBA'IN AN-NAWAWI", "Arbain Nawawi atau Al-Arba'in An-Nawawiyah merupakan kitab yang memuat empat puluh dua hadits pilihan yang disusun oleh Imam Nawawi. Arba'in berarti empat puluh namun sebenarnya terdapat empat puluh dua hadits yang termuat dalam kitab ini", "https://i.postimg.cc/N0t8z8y7/arbain-removebg-preview.png"}
    };
    public static ArrayList<Kitab> getListData(){
        ArrayList<Kitab> list = new ArrayList<>();
        for (String [] aData : data){
            Kitab kitab = new Kitab();
            kitab.setId(Integer.parseInt(aData[0]));
            kitab.setName(aData[1]);
            kitab.setDescription(aData[2]);
            kitab.setPhoto(aData[3]);

            list.add(kitab);
        }
        return list;
    }
}
