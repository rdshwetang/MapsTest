/* 
 * @author Shwetang R.D 
 * Visual Sistemas Electronicos Ltda.
 * Belo Horizonte-Brazil -2014
 */
package com.mapstest.android;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

	public class MainActivity extends FragmentActivity {
		  static final LatLng HAMBURG = new LatLng(53.558, 9.927);
		  static final LatLng KIEL = new LatLng(53.551, 9.993);
		  private GoogleMap map;

		  @Override
		public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
		        .getMap();
		    Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
		        .title("Hamburg"));
		    Marker kiel = map.addMarker(new MarkerOptions()
		        .position(KIEL)
		        .title("Kiel")
		        .snippet("Kiel is cool")
		        .icon(BitmapDescriptorFactory
		            .fromResource(R.drawable.ic_launcher)));

		    // Move the camera instantly to hamburg with a zoom of 15.
		    map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));

		    // Zoom in, animating the camera.
		    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		  }

		public boolean onCreateOptionsMenu(Menu menu) {
		    //getMenuInflater().inflate(R.menu.main, menu);
		    return true;
		  }
		} 