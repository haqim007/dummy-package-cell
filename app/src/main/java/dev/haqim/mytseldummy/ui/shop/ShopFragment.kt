package dev.haqim.mytseldummy.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dev.haqim.mytseldummy.R
import dev.haqim.mytseldummy.databinding.FragmentShopBinding


class ShopFragment : Fragment() {
    private lateinit var binding: FragmentShopBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentShopBinding.inflate(layoutInflater, container, false)

//        binding.vpMoreInfo.adapter = TabLayoutAdapter(this, listFragment)
//        TabLayoutMediator(binding.tabLayout, binding.vpMoreInfo) {
//                tab: TabLayout.Tab, position: Int -> tab.text = TAB_TITLES[position]
//        }.attach()
        
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

}