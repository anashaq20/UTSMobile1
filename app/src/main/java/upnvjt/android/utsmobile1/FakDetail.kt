package upnvjt.android.utsmobile1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fak.*

class FakDetail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fak)
        var intentThatStartThisActivity = this.getIntent()
        if (intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var logoF = intentThatStartThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namaF = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var descF = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var detailF = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            image_fakultas_detail.setImageResource(logoF)
            nama_fak_detail.text = namaF
            deskripsi_fakultas.text = descF
            detail_fakultas.text = detailF
        }
    }
}