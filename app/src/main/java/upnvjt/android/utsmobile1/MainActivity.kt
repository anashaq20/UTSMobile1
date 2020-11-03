package upnvjt.android.utsmobile1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_fak.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFak()
        RVku.layoutManager = LinearLayoutManager(this)
        RVku.setHasFixedSize(true)
        RVku.adapter = AdapterFakultas(data, { onItem: DataFak -> onItemClicked(onItem)} )
    }

    private fun onItemClicked(itemClick : DataFak) {
        val showDetailActivityIntent = Intent(this, FakDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, itemClick.logoFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemClick.namaFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, itemClick.descFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, itemClick.detailFak)
        startActivity(showDetailActivityIntent)
        val ItemKlik = itemClick.namaFak.toString()
        Toast.makeText(this,"Anda memilih $ItemKlik",Toast.LENGTH_LONG).show()
    }
    private fun createFak(): List<DataFak>{
            val listRV = ArrayList<DataFak>()
            listRV.add(
                    DataFak(
                            R.drawable.logoupnbaru,
                            "Fakultas Ekonomi dan Bisnis",
                            "Fakultas Ekonomi dan Bisnis " +
                                    "adalah satu dari 7 fakultas " +
                                    "yang ada di UPN Veteran Jatim yang terdiri dari program studi :",
                            "1.\t Ekonomi Pembangunan.\n" +
                                    "2.\t Akuntansi.\n" +
                                    "3.\t Manajemen."
                    )
            )

            listRV.add(
                    DataFak(
                            R.drawable.logoupnbaru,
                            "Fakultas Pertanian",
                            "Fakultas Pertanian " +
                                    "adalah satu dari 7 fakultas " +
                                    "yang ada di UPN Veteran Jatim yang terdiri dari program studi :",
                            "1.\t Agroteknologi.\n" +
                                    "2.\t Agribisnis."
                    )
            )

            listRV.add(
                    DataFak(
                            R.drawable.logoupnbaru,
                            "Fakultas Teknik",
                            "Fakultas Teknik " +
                                    "adalah satu dari 7 fakultas " +
                                    "yang ada di UPN Veteran Jatim yang terdiri dari program studi :",
                            "1.\t Teknik Kimia.\n" +
                                    "2.\t Teknik Industri.\n" +
                                    "3.\t Teknik Sipil.\n" +
                                    "4.\t Teknik Lingkungan.\n" +
                                    "5.\t Teknologi Pangan.\n" +
                                    "6.\t Teknik Mesin."
                    )
            )

            listRV.add(
                    DataFak(
                            R.drawable.logoupnbaru,
                            "Fakultas Ilmu Komputer",
                            "Fakultas Ilmu Komputer " +
                                    "adalah satu dari 7 fakultas " +
                                    "yang ada di UPN Veteran Jatim yang terdiri dari program studi :",
                            "1.\t Informatika.\n" +
                                    "2.\t Sistem Informasi.\n" +
                                    "3.\t Data Sains."
                    )
            )

            listRV.add(
                    DataFak(
                            R.drawable.me,
                            "Profil Singkat",
                            "Ahmad Nashirul Haq\n" +
                                    "Tempat, Tanggal Lahir\t: Sampang, 19 Agustus 2000.\n" +
                                    "Alamat\t: Jaksa Agung Suprapto no.95, Sampang, Madura.\n" +
                                    "No. HP\t: 085231689831\n" +
                                    "Email\t: ramboxman23@gmail.com\n" +
                                    "Github\t: https://github.com/anashaq20\n",
                            "Riwayat Pendidikan\t: \n" +
                                    "1.\t SDN Gunung Sekar 1 Sampang.\n" +
                                    "2.\t SMPN 1 Sampang.\n" +
                                    "3.\t SMAN 1 Sampang.\n" +
                                    "Penghargaan\t: -"
                    )
            )
            return listRV
    }
}
