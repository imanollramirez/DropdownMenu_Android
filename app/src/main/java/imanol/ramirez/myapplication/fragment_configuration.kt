package imanol.ramirez.myapplication

import android.os.Bundle
import android.provider.DocumentsContract.Root
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class fragment_configuration : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //En los fragments siempre hay que escribir el código dentro de la función "onCreateView"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {





        return inflater.inflate(R.layout.fragment_configuration, container, false)
    }
}