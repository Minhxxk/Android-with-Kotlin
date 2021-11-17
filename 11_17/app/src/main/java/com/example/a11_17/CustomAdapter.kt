package com.example.a11_17

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val context: Context, private val dataList: ArrayList<dataVo>):
RecyclerView.Adapter<CustomAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val userImg = itemView.findViewById<ImageView>(R.id.user_img)
        private val userName = itemView.findViewById<TextView>(R.id.user_name)
        private val userContact = itemView.findViewById<TextView>(R.id.user_contact)

        //사진 처리
        //userImg의 setImageResource에 들어갈 이미지의 id를 파일명(String)으로 찾고,
        //이미지가 없는 경우 안드로이드 기본 아이콘을 표시
        fun bind(dataVo: dataVo, context:Context){
            //데이터클래스의 이미지의 파일명이 빈칸일 경우
            if(dataVo.img != ""){
                val resourceId = context.resources.getIdentifier(dataVo.img, "drawable", context.packageName)
                if (resourceId > 0){
                    userImg.setImageResource(resourceId)
                }
                else {
                    userImg.setImageResource(R.color.purple_700)
                }
            }
            else {
                userImg.setImageResource(R.mipmap.ic_launcher_round)
            }
            //나머지 TextView와 String 데이터 세팅(연결)
            userName.text = dataVo.name
            userContact.text = dataVo.contact
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_layout, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataList[position], context)
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
}