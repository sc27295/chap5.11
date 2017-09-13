/**
 Siam-Al-mer Chowdhury
 * CSC 201-004N
 Professor Tanes Kanchanawanchai
 Assignment
 ***** BEGIN LICENSE BLOCK *****
 Version: MPL 1.1/GPL 2.0/LGPL 2.1
 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the
 License.
 The Initial Developer of the Original Code is
 Tushar Balarajan.
 Portions created by the Initial Developer are Copyright (C) 2017
 the Initial Developer. All Rights Reserved.
 Contributor(s):
 Alternatively, the contents of this file may be used under the terms of
 either the GNU General Public License Version 2 or later (the "GPL"), or
 the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 in which case the provisions of the GPL or the LGPL are applicable instead
 of those above. If you wish to allow use of your version of this file only
 under the terms of either the GPL or the LGPL, and not to allow others to
 use your version of this file under the terms of the MPL, indicate your
 decision by deleting the provisions above and replace them with the notice
 and other provisions required by the GPL or the LGPL. If you do not delete
 the provisions above, a recipient may use your version of this file under
 the terms of any one of the MPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****
 */


//Declare class name
public class NumDivisible {
    public static void main(String[] args) {
        int count=0;

        //calculate whether the number is divisible by 5 or 6 but not both
        for(int i=100;i<=200;i++){
            if (count<10)
                if(( i%5==0 && i%6!=0)||(i%5!=0 && i%6==0))
                //check whether the number is divisible by 5 or 6
{
 System.out.print(i+ " ");//print the output
 count++;
}
//Checks to print 10 numbers per line
if (count==10){
                System.out.println();
                count=0;

}
        }
    }
}
