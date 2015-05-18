// Catalano Math Library
// The Catalano Framework
//
// Copyright © Diego Catalano, 2015
// diego.catalano at live.com
//
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU Lesser General Public
//    License as published by the Free Software Foundation; either
//    version 2.1 of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
//

package Catalano.Math.Distances;

/**
 * Hamming distance.
 * In information theory, the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different. 
 * 
 * @author Diego Catalano
 */
public class HammingDistance implements IDistance{

    /**
     * Initializes a new instance of the HammingDistance class.
     */
    public HammingDistance() {}
    
    /**
     * Compute the hamming distance between two strings.
     * @param first First string.
     * @param second Second string.
     * @return Hamming distance.
     */
    public int Compute(String first, String second){
        int d = 0;
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) d++;
        }
        return d;
    }

    @Override
    public double Compute(double[] u, double[] v) {
        double distance = 0;
        
        for (int i = 0; i < u.length; i++) {
            if (u[i] != v[i]) distance++;
        }
        
        return distance;
    }
}