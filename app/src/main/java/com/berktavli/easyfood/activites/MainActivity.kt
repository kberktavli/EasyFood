package com.berktavli.easyfood.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.berktavli.easyfood.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         Bu satırda, layout dosyanızdaki btm_nav ID'sine sahip Bottom Navigation View'ı bulup bottomNavigation adında bir değişkene atıyorsunuz.
         Bu değişken, Bottom Navigation View'ı kod içinde yönetmenizi sağlar.
         */
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.btm_nav)
        /*
        Bu satırda, gezinme bileşeninin findNavController yöntemini kullanarak host_fragment ID'sine sahip NavHostFragment'ın NavController
         nesnesini alıyorsunuz. NavController, sayfa geçişlerini yönetmeye yardımcı olan bir nesnedir.
         */
        val navController = Navigation.findNavController(this, R.id.host_fragment)
        /*
        NavigationUI.setupWithNavController(bottomNavigation, navController): Bu satırda, NavController'ı ve Bottom Navigation View'ı
        birbirine bağlayarak sayfa geçişlerini yönetmek üzere yapılandırıyorsunuz.Bu, kullanıcının Bottom Navigation View
        içindeki sekmelere tıkladığında uygun sayfanın görüntülenmesini sağlar.
         */
        NavigationUI.setupWithNavController(bottomNavigation, navController)

    }
}