package cat.copernic.finall.aitor.burruezo.rodriguez

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_ThirdToMain).setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_FirstFragment)
        }

        view.findViewById<Button>(R.id.btn_Third1).setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_third1Fragment)
        }
    }
}