package ridhasappsforfunandeducation.app1;


import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class Dialog extends DialogFragment {


    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder Dialog = new AlertDialog.Builder(getActivity());

       Dialog.setTitle("dialog");

        Dialog.setMessage("Are you sure you want to exit this app!");

        Dialog.setNegativeButton("CANCEL I LOVE THIS APP!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), " clicked cancel cause you love this app",
                        Toast.LENGTH_LONG).show();
            }
        });
        Dialog.setPositiveButton("yes!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), " clicked ok",
                        Toast.LENGTH_SHORT) .show();
            }
        });

        return super.onCreateDialog(savedInstanceState);


    }
}
