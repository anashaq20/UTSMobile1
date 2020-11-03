package upnvjt.android.utsmobile1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.list_fak.view.*

class AdapterFakultas (private val itemFak : List<DataFak>,
                       val clickListener : (DataFak) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        //membuat value inflater yang akan mengambil nilai-nilai style yang ada pada parent viewnya
        val view = inflater.inflate(R.layout.list_fak, parent, false)
        //membuat value view yang akan menampilkan layout list_fak.xml dalam parent view
        //dengan terpisah dari parentnya.
        return PartViewHolder(view)
        //fungsi ini akan mengembalikan nilai dari pemanggilan fungsi partviewholder
        //dengan parameter view
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as PartViewHolder).pengikat(itemFak[position], clickListener)
        //membuat variabel holder untuk mengikat item fakultas yang ada dalam list
    }

    override fun getItemCount(): Int = itemFak.size
        //mengembalikan nilai dari ukuran item fakultas yang ada dalam list

    class PartViewHolder(ItemView : View ) : ViewHolder(ItemView){
        fun pengikat(data : DataFak, clickListener: (DataFak) -> Unit){
            itemView.image_fak.setImageResource(data.logoFak)
            itemView.nama_fak.text = data.namaFak
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}