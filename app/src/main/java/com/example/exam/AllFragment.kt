package com.example.exam

import android.content.ClipData.Item
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class AllFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all, container, false)


        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


        val customerList = arrayListOf(
            Customer(1, "https://icon2.cleanpng.com/20240324/hbz/transparent-world-obesity-day-obesity-fast-food-unhealthy-eati-overweight-man-in-shirt-holds-hamburger-happily65fffc54b98529.63858629.webp", "Orkhan", "Azerbaijan/Baku/Yasamal", isActive = true),
            Customer(2, "https://icon2.cleanpng.com/lnd/20240422/hvr/transparent-little-black-girl-fashion-style-clothing-outfit-image-url-required-for-picture-submission6626f0e8a25679.39246553.webp", "Lisa", "Poland/Warsaw", isActive = true),
            Customer(3, "https://icon2.cleanpng.com/20240226/alo/transparent-employee-appreciation-day-hospitality-restaurant-c-smiling-man-in-orange-shirt-and-1710864587950.webp", "Alex", "England/London", isActive = false),
            Customer(4, "https://icon2.cleanpng.com/20240324/hbz/transparent-world-obesity-day-obesity-fast-food-unhealthy-eati-overweight-man-in-shirt-holds-hamburger-happily65fffc54b98529.63858629.webp", "Ahmad", "Azerbaijan/Guba", isActive = true),
            Customer(5, "https://icon2.cleanpng.com/lnd/20240422/hvr/transparent-little-black-girl-fashion-style-clothing-outfit-image-url-required-for-picture-submission6626f0e8a25679.39246553.webp", "Mariana", "Ukraine/Kiev", isActive = false),
            Customer(6, "https://icon2.cleanpng.com/20240226/alo/transparent-employee-appreciation-day-hospitality-restaurant-c-smiling-man-in-orange-shirt-and-1710864587950.webp", "Alex", "England/London", isActive = true),
            Customer(7, "https://icon2.cleanpng.com/20240226/alo/transparent-employee-appreciation-day-hospitality-restaurant-c-smiling-man-in-orange-shirt-and-1710864587950.webp", "Susan", "USA/NewYork", isActive = false),
            Customer(8, "https://icon2.cleanpng.com/20240324/hbz/transparent-world-obesity-day-obesity-fast-food-unhealthy-eati-overweight-man-in-shirt-holds-hamburger-happily65fffc54b98529.63858629.webp", "Mustafa", "Turkey/Ankara", isActive = true),
            Customer(9, "https://icon2.cleanpng.com/20240324/hbz/transparent-world-obesity-day-obesity-fast-food-unhealthy-eati-overweight-man-in-shirt-holds-hamburger-happily65fffc54b98529.63858629.webp", "Ahmad", "Azerbaijan/Guba", isActive = false),
        )


        myAdapter = MyAdapter(customerList)

        val layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = myAdapter
    }
}

