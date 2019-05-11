package com.example.android.mobiledevelopment7_2;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][] {
            {"Soekarno", "Presiden pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden Sukarno.jpg"},
            {"Soeharto", "Presiden kedua RI", "https://upload.wikimedia.org/wikipedia/commons/5/59/President_Suharto%2C_1993.jpg"},
            {"Bacharuddin Jusuf Habibie", "Presiden ketiga RI", "https://indonesia.go.id/assets/img/president/1544064315_habibie_pres.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI","https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI","https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI","https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Joko Widodo", "Presiden Ketujuh RI","https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
    };

    public static ArrayList<President> getListData() {
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            president = new President();
            president.setName(data[i][0]);
            president.setRemarks(data[i][1]);
            president.setPhotoURL(data[i][2]);

            list.add(president);
        }
        return list;
    }
}
