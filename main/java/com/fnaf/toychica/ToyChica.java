/*   1:    */ package com.fnaf.toychica;
/*   2:    */ 
/*   3:    */ import net.minecraft.client.model.ModelBase;
/*   4:    */ import net.minecraft.client.model.ModelRenderer;
/*   5:    */ import net.minecraft.entity.Entity;
/*   6:    */ 
/*   7:    */ public class ToyChica
/*   8:    */   extends ModelBase
/*   9:    */ {
/*  10:    */   ModelRenderer Shape1;
/*  11:    */   ModelRenderer Shape2;
/*  12:    */   ModelRenderer Shape3;
/*  13:    */   ModelRenderer Shape4;
/*  14:    */   ModelRenderer Shape7;
/*  15:    */   ModelRenderer Shape8;
/*  16:    */   ModelRenderer Shape9;
/*  17:    */   ModelRenderer Shape10;
/*  18:    */   ModelRenderer Shape11;
/*  19:    */   ModelRenderer Shape12;
/*  20:    */   ModelRenderer Shape13;
/*  21:    */   ModelRenderer Shape14;
/*  22:    */   ModelRenderer Shape15;
/*  23:    */   ModelRenderer Shape18;
/*  24:    */   ModelRenderer Shape20;
/*  25:    */   ModelRenderer Shape24;
/*  26:    */   ModelRenderer Shape30;
/*  27:    */   ModelRenderer Shape31;
/*  28:    */   ModelRenderer Shape32;
/*  29:    */   ModelRenderer Shape33;
/*  30:    */   ModelRenderer Shape34;
/*  31:    */   ModelRenderer Shape35;
/*  32:    */   ModelRenderer Shape36;
/*  33:    */   ModelRenderer Shape37;
/*  34:    */   ModelRenderer Shape38;
/*  35:    */   ModelRenderer Shape39;
/*  36:    */   ModelRenderer Shape40;
/*  37:    */   ModelRenderer Shape41;
/*  38:    */   ModelRenderer Shape42;
/*  39:    */   ModelRenderer Shape43;
/*  40:    */   ModelRenderer Shape44;
/*  41:    */   ModelRenderer Shape45;
/*  42:    */   ModelRenderer Shape46;
/*  43:    */   ModelRenderer Shape47;
/*  44:    */   ModelRenderer Shape48;
/*  45:    */   ModelRenderer Shape49;
/*  46:    */   ModelRenderer Shape50;
/*  47:    */   ModelRenderer Shape51;
/*  48:    */   ModelRenderer Shape52;
/*  49:    */   ModelRenderer Shape53;
/*  50:    */   ModelRenderer Shape54;
/*  51:    */   ModelRenderer Shape55;
/*  52:    */   ModelRenderer Shape56;
/*  53:    */   ModelRenderer Shape57;
/*  54:    */   ModelRenderer Shape58;
/*  55:    */   ModelRenderer Shape59;
/*  56:    */   ModelRenderer Shape60;
/*  57:    */   ModelRenderer Shape61;
/*  58:    */   ModelRenderer Shape62;
/*  59:    */   
/*  60:    */   public ToyChica()
/*  61:    */   {
/*  62: 62 */     this.field_78090_t = 128;
/*  63: 63 */     this.field_78089_u = 64;
/*  64:    */     
/*  65: 65 */     this.Shape1 = new ModelRenderer(this, 0, 0);
/*  66: 66 */     this.Shape1.func_78789_a(-1.5F, 0.0F, -5.0F, 3, 2, 6);
/*  67: 67 */     this.Shape1.func_78793_a(-2.3F, 22.0F, 3.0F);
/*  68: 68 */     this.Shape1.func_78787_b(128, 64);
/*  69: 69 */     this.Shape1.field_78809_i = true;
/*  70: 70 */     setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/*  71: 71 */     this.Shape2 = new ModelRenderer(this, 0, 0);
/*  72: 72 */     this.Shape2.func_78789_a(-1.5F, 0.0F, -5.0F, 3, 2, 6);
/*  73: 73 */     this.Shape2.func_78793_a(2.3F, 22.0F, 3.0F);
/*  74: 74 */     this.Shape2.func_78787_b(128, 64);
/*  75: 75 */     this.Shape2.field_78809_i = true;
/*  76: 76 */     setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/*  77: 77 */     this.Shape3 = new ModelRenderer(this, 0, 18);
/*  78: 78 */     this.Shape3.func_78789_a(-1.5F, 0.0F, -0.7F, 3, 6, 3);
/*  79: 79 */     this.Shape3.func_78793_a(-2.2F, 17.0F, 1.0F);
/*  80: 80 */     this.Shape3.func_78787_b(128, 64);
/*  81: 81 */     this.Shape3.field_78809_i = true;
/*  82: 82 */     setRotation(this.Shape3, 0.0698132F, 0.0F, 0.0F);
/*  83: 83 */     this.Shape4 = new ModelRenderer(this, 0, 18);
/*  84: 84 */     this.Shape4.func_78789_a(-1.5F, 0.0F, -0.7F, 3, 6, 3);
/*  85: 85 */     this.Shape4.func_78793_a(2.2F, 17.0F, 1.0F);
/*  86: 86 */     this.Shape4.func_78787_b(128, 64);
/*  87: 87 */     this.Shape4.field_78809_i = true;
/*  88: 88 */     setRotation(this.Shape4, 0.0698132F, 0.0F, 0.0F);
/*  89: 89 */     this.Shape7 = new ModelRenderer(this, 0, 53);
/*  90: 90 */     this.Shape7.func_78789_a(-3.5F, -1.0F, -1.5F, 7, 2, 5);
/*  91: 91 */     this.Shape7.func_78793_a(0.0F, 9.466666F, 1.0F);
/*  92: 92 */     this.Shape7.func_78787_b(128, 64);
/*  93: 93 */     this.Shape7.field_78809_i = true;
/*  94: 94 */     setRotation(this.Shape7, 0.034907F, 0.0F, 0.0F);
/*  95: 95 */     this.Shape8 = new ModelRenderer(this, 0, 34);
/*  96: 96 */     this.Shape8.func_78789_a(-1.533333F, -1.0F, -1.7F, 3, 6, 4);
/*  97: 97 */     this.Shape8.func_78793_a(-2.0F, 11.46667F, 1.5F);
/*  98: 98 */     this.Shape8.func_78787_b(128, 64);
/*  99: 99 */     this.Shape8.field_78809_i = true;
/* 100:100 */     setRotation(this.Shape8, -0.034907F, 0.0F, 0.034907F);
/* 101:101 */     this.Shape9 = new ModelRenderer(this, 0, 34);
/* 102:102 */     this.Shape9.func_78789_a(-1.5F, -1.0F, -1.666667F, 3, 6, 4);
/* 103:103 */     this.Shape9.func_78793_a(2.0F, 11.46667F, 1.5F);
/* 104:104 */     this.Shape9.func_78787_b(128, 64);
/* 105:105 */     this.Shape9.field_78809_i = true;
/* 106:106 */     setRotation(this.Shape9, -0.034907F, 0.0F, -0.034907F);
/* 107:107 */     this.Shape10 = new ModelRenderer(this, 28, 55);
/* 108:108 */     this.Shape10.func_78789_a(-2.0F, -1.0F, -1.266667F, 4, 1, 3);
/* 109:109 */     this.Shape10.func_78793_a(0.0F, 8.466666F, 1.5F);
/* 110:110 */     this.Shape10.func_78787_b(128, 64);
/* 111:111 */     this.Shape10.field_78809_i = true;
/* 112:112 */     setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
/* 113:113 */     this.Shape11 = new ModelRenderer(this, 17, 38);
/* 114:114 */     this.Shape11.func_78789_a(-2.5F, -1.0F, -1.2F, 5, 4, 4);
/* 115:115 */     this.Shape11.func_78793_a(0.0F, 5.3F, 1.0F);
/* 116:116 */     this.Shape11.func_78787_b(128, 64);
/* 117:117 */     this.Shape11.field_78809_i = true;
/* 118:118 */     setRotation(this.Shape11, 0.017453F, 0.0F, 0.0F);
/* 119:119 */     this.Shape12 = new ModelRenderer(this, 0, 29);
/* 120:120 */     this.Shape12.func_78789_a(-1.0F, -0.5F, -1.0F, 2, 2, 2);
/* 121:121 */     this.Shape12.func_78793_a(2.2F, 16.0F, 2.0F);
/* 122:122 */     this.Shape12.func_78787_b(128, 64);
/* 123:123 */     this.Shape12.field_78809_i = true;
/* 124:124 */     setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
/* 125:125 */     this.Shape13 = new ModelRenderer(this, 0, 29);
/* 126:126 */     this.Shape13.func_78789_a(-1.0F, -0.5F, -1.0F, 2, 2, 2);
/* 127:127 */     this.Shape13.func_78793_a(-2.233333F, 16.0F, 2.0F);
/* 128:128 */     this.Shape13.func_78787_b(128, 64);
/* 129:129 */     this.Shape13.field_78809_i = true;
/* 130:130 */     setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
/* 131:131 */     this.Shape14 = new ModelRenderer(this, 19, 26);
/* 132:132 */     this.Shape14.func_78789_a(-3.5F, 0.0F, -2.5F, 7, 5, 5);
/* 133:133 */     this.Shape14.func_78793_a(0.0F, -0.4333333F, 1.333333F);
/* 134:134 */     this.Shape14.func_78787_b(128, 64);
/* 135:135 */     this.Shape14.field_78809_i = true;
/* 136:136 */     setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
/* 137:137 */     this.Shape15 = new ModelRenderer(this, 19, 20);
/* 138:138 */     this.Shape15.func_78789_a(-1.0F, -1.3F, -1.0F, 2, 2, 2);
/* 139:139 */     this.Shape15.func_78793_a(0.0F, -0.4333333F, 1.733333F);
/* 140:140 */     this.Shape15.func_78787_b(128, 64);
/* 141:141 */     this.Shape15.field_78809_i = true;
/* 142:142 */     setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
/* 143:143 */     this.Shape18 = new ModelRenderer(this, 50, 44);
/* 144:144 */     this.Shape18.func_78789_a(-4.0F, -6.0F, -4.0F, 8, 3, 5);
/* 145:145 */     this.Shape18.func_78793_a(0.0F, -1.4F, 2.733333F);
/* 146:146 */     this.Shape18.func_78787_b(128, 64);
/* 147:147 */     this.Shape18.field_78809_i = true;
/* 148:148 */     setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
/* 149:149 */     this.Shape20 = new ModelRenderer(this, 50, 38);
/* 150:150 */     this.Shape20.func_78789_a(-3.5F, -6.94F, -3.5F, 7, 1, 4);
/* 151:151 */     this.Shape20.func_78793_a(0.0F, -1.433333F, 2.733333F);
/* 152:152 */     this.Shape20.func_78787_b(128, 64);
/* 153:153 */     this.Shape20.field_78809_i = true;
/* 154:154 */     setRotation(this.Shape20, 0.0F, 0.0F, 0.0F);
/* 155:155 */     this.Shape24 = new ModelRenderer(this, 34, 11);
/* 156:156 */     this.Shape24.func_78789_a(-1.5F, -5.066667F, 0.0F, 2, 5, 1);
/* 157:157 */     this.Shape24.func_78793_a(0.8666667F, -7.366667F, 1.733333F);
/* 158:158 */     this.Shape24.func_78787_b(128, 64);
/* 159:159 */     this.Shape24.field_78809_i = true;
/* 160:160 */     setRotation(this.Shape24, 0.6981317F, 0.7853982F, -0.0698132F);
/* 161:161 */     this.Shape30 = new ModelRenderer(this, 60, 5);
/* 162:162 */     this.Shape30.func_78789_a(-1.0F, 0.5333334F, -1.5F, 2, 5, 3);
/* 163:163 */     this.Shape30.func_78793_a(-3.5F, 0.0F, 2.0F);
/* 164:164 */     this.Shape30.func_78787_b(128, 64);
/* 165:165 */     this.Shape30.field_78809_i = true;
/* 166:166 */     setRotation(this.Shape30, 0.0F, 0.0F, 0.2792527F);
/* 167:167 */     this.Shape31 = new ModelRenderer(this, 60, 5);
/* 168:168 */     this.Shape31.func_78789_a(-1.0F, 0.5333334F, -1.5F, 2, 5, 3);
/* 169:169 */     this.Shape31.func_78793_a(3.5F, 0.0F, 2.0F);
/* 170:170 */     this.Shape31.func_78787_b(128, 64);
/* 171:171 */     this.Shape31.field_78809_i = true;
/* 172:172 */     setRotation(this.Shape31, 0.0F, 0.0F, -0.2792527F);
/* 173:173 */     this.Shape32 = new ModelRenderer(this, 47, 5);
/* 174:174 */     this.Shape32.func_78789_a(-0.5F, 0.5333334F, -1.0F, 2, 5, 2);
/* 175:175 */     this.Shape32.func_78793_a(-5.466667F, 4.5F, 2.0F);
/* 176:176 */     this.Shape32.func_78787_b(128, 64);
/* 177:177 */     this.Shape32.field_78809_i = true;
/* 178:178 */     setRotation(this.Shape32, -0.10472F, 0.0F, 0.1396263F);
/* 179:179 */     this.Shape33 = new ModelRenderer(this, 47, 5);
/* 180:180 */     this.Shape33.func_78789_a(-1.5F, 0.5333334F, -1.0F, 2, 5, 2);
/* 181:181 */     this.Shape33.func_78793_a(5.966667F, 4.5F, 2.0F);
/* 182:182 */     this.Shape33.func_78787_b(128, 64);
/* 183:183 */     this.Shape33.field_78809_i = true;
/* 184:184 */     setRotation(this.Shape33, -1.570796F, 0.0F, -0.1396263F);
/* 185:185 */     this.Shape34 = new ModelRenderer(this, 51, 24);
/* 186:186 */     this.Shape34.func_78789_a(-0.5F, 5.533333F, -1.5F, 2, 2, 3);
/* 187:187 */     this.Shape34.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 188:188 */     this.Shape34.func_78787_b(128, 64);
/* 189:189 */     this.Shape34.field_78809_i = true;
/* 190:190 */     setRotation(this.Shape34, -0.10472F, 0.0F, 0.1396263F);
/* 191:191 */     this.Shape35 = new ModelRenderer(this, 51, 31);
/* 192:192 */     this.Shape35.func_78789_a(-1.466667F, 5.533333F, -1.5F, 2, 2, 3);
/* 193:193 */     this.Shape35.func_78793_a(5.5F, 4.5F, 2.0F);
/* 194:194 */     this.Shape35.func_78787_b(128, 64);
/* 195:195 */     this.Shape35.field_78809_i = true;
/* 196:196 */     setRotation(this.Shape35, -1.570796F, 0.0F, 1.570796F);
/* 197:197 */     this.Shape36 = new ModelRenderer(this, 54, 56);
/* 198:198 */     this.Shape36.func_78789_a(-4.0F, -3.0F, -4.0F, 8, 2, 5);
/* 199:199 */     this.Shape36.func_78793_a(0.0F, -1.433333F, 2.733333F);
/* 200:200 */     this.Shape36.func_78787_b(128, 64);
/* 201:201 */     this.Shape36.field_78809_i = true;
/* 202:202 */     setRotation(this.Shape36, 0.0F, 0.0F, 0.0F);
/* 203:203 */     this.Shape37 = new ModelRenderer(this, 80, 44);
/* 204:204 */     this.Shape37.func_78789_a(-3.5F, -1.0F, -4.0F, 7, 1, 5);
/* 205:205 */     this.Shape37.func_78793_a(0.0F, -1.433333F, 2.733333F);
/* 206:206 */     this.Shape37.func_78787_b(128, 64);
/* 207:207 */     this.Shape37.field_78809_i = true;
/* 208:208 */     setRotation(this.Shape37, 0.0F, 0.0F, 0.0F);
/* 209:209 */     this.Shape38 = new ModelRenderer(this, 34, 11);
/* 210:210 */     this.Shape38.func_78789_a(-1.5F, -5.066667F, 0.0F, 2, 5, 1);
/* 211:211 */     this.Shape38.func_78793_a(0.5333334F, -7.366667F, 1.6F);
/* 212:212 */     this.Shape38.func_78787_b(128, 64);
/* 213:213 */     this.Shape38.field_78809_i = true;
/* 214:214 */     setRotation(this.Shape38, 1.082104F, 1.22173F, 0.034907F);
/* 215:215 */     this.Shape39 = new ModelRenderer(this, 34, 11);
/* 216:216 */     this.Shape39.func_78789_a(-1.5F, -4.066667F, 0.0F, 2, 4, 1);
/* 217:217 */     this.Shape39.func_78793_a(2.997602E-015F, -7.366667F, 2.066667F);
/* 218:218 */     this.Shape39.func_78787_b(128, 64);
/* 219:219 */     this.Shape39.field_78809_i = true;
/* 220:220 */     setRotation(this.Shape39, 1.064651F, -1.185068F, -0.0698132F);
/* 221:221 */     this.Shape40 = new ModelRenderer(this, 44, 50);
/* 222:222 */     this.Shape40.func_78789_a(-2.0F, -1.0F, -1.0F, 2, 1, 1);
/* 223:223 */     this.Shape40.func_78793_a(-1.0F, -6.7F, 0.0F);
/* 224:224 */     this.Shape40.func_78787_b(128, 64);
/* 225:225 */     this.Shape40.field_78809_i = true;
/* 226:226 */     setRotation(this.Shape40, 0.0F, 0.0F, -0.034907F);
/* 227:227 */     this.Shape41 = new ModelRenderer(this, 44, 50);
/* 228:228 */     this.Shape41.func_78789_a(0.0F, -1.0F, -1.0F, 2, 1, 1);
/* 229:229 */     this.Shape41.func_78793_a(1.0F, -6.7F, 0.0F);
/* 230:230 */     this.Shape41.func_78787_b(128, 64);
/* 231:231 */     this.Shape41.field_78809_i = true;
/* 232:232 */     setRotation(this.Shape41, 0.0F, 0.0F, 0.034907F);
/* 233:233 */     this.Shape42 = new ModelRenderer(this, 50, 38);
/* 234:234 */     this.Shape42.func_78789_a(-3.0F, -7.0F, -3.5F, 6, 1, 4);
/* 235:235 */     this.Shape42.func_78793_a(0.0F, 5.166667F, 2.733333F);
/* 236:236 */     this.Shape42.func_78787_b(128, 64);
/* 237:237 */     this.Shape42.field_78809_i = true;
/* 238:238 */     setRotation(this.Shape42, 0.0F, 0.0F, 0.0F);
/* 239:239 */     this.Shape43 = new ModelRenderer(this, 4, 23);
/* 240:240 */     this.Shape43.func_78789_a(-0.5F, 7.533333F, -1.5F, 1, 2, 1);
/* 241:241 */     this.Shape43.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 242:242 */     this.Shape43.func_78787_b(128, 64);
/* 243:243 */     this.Shape43.field_78809_i = true;
/* 244:244 */     setRotation(this.Shape43, -0.10472F, 0.0F, 0.1396263F);
/* 245:245 */     this.Shape44 = new ModelRenderer(this, 4, 23);
/* 246:246 */     this.Shape44.func_78789_a(-0.5F, 7.533333F, 0.5F, 1, 2, 1);
/* 247:247 */     this.Shape44.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 248:248 */     this.Shape44.func_78787_b(128, 64);
/* 249:249 */     this.Shape44.field_78809_i = true;
/* 250:250 */     setRotation(this.Shape44, -0.10472F, 0.0F, 0.1396263F);
/* 251:251 */     this.Shape45 = new ModelRenderer(this, 4, 23);
/* 252:252 */     this.Shape45.func_78789_a(-0.8F, 7.533333F, -0.5F, 1, 2, 1);
/* 253:253 */     this.Shape45.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 254:254 */     this.Shape45.func_78787_b(128, 64);
/* 255:255 */     this.Shape45.field_78809_i = true;
/* 256:256 */     setRotation(this.Shape45, -0.10472F, 0.0F, 0.1396263F);
/* 257:257 */     this.Shape46 = new ModelRenderer(this, 4, 23);
/* 258:258 */     this.Shape46.func_78789_a(0.4F, 7.1F, -1.8F, 1, 2, 1);
/* 259:259 */     this.Shape46.func_78793_a(-5.5F, 4.5F, 2.0F);
/* 260:260 */     this.Shape46.func_78787_b(128, 64);
/* 261:261 */     this.Shape46.field_78809_i = true;
/* 262:262 */     setRotation(this.Shape46, -0.10472F, 0.0F, 0.1396263F);
/* 263:263 */     this.Shape47 = new ModelRenderer(this, 4, 23);
/* 264:264 */     this.Shape47.func_78789_a(-0.466667F, 7.533333F, -1.5F, 1, 2, 1);
/* 265:265 */     this.Shape47.func_78793_a(5.5F, 4.5F, 2.0F);
/* 266:266 */     this.Shape47.func_78787_b(128, 64);
/* 267:267 */     this.Shape47.field_78809_i = true;
/* 268:268 */     setRotation(this.Shape47, -1.570796F, 0.0F, 1.570796F);
/* 269:269 */     this.Shape48 = new ModelRenderer(this, 4, 23);
/* 270:270 */     this.Shape48.func_78789_a(-0.466667F, 7.533333F, 0.5F, 1, 2, 1);
/* 271:271 */     this.Shape48.func_78793_a(5.5F, 4.5F, 2.0F);
/* 272:272 */     this.Shape48.func_78787_b(128, 64);
/* 273:273 */     this.Shape48.field_78809_i = true;
/* 274:274 */     setRotation(this.Shape48, -1.570796F, 0.0F, 1.570796F);
/* 275:275 */     this.Shape49 = new ModelRenderer(this, 4, 23);
/* 276:276 */     this.Shape49.func_78789_a(-0.2F, 7.533333F, -0.5F, 1, 2, 1);
/* 277:277 */     this.Shape49.func_78793_a(5.5F, 4.5F, 2.0F);
/* 278:278 */     this.Shape49.func_78787_b(128, 64);
/* 279:279 */     this.Shape49.field_78809_i = true;
/* 280:280 */     setRotation(this.Shape49, -1.570796F, 0.0F, 1.570796F);
/* 281:281 */     this.Shape50 = new ModelRenderer(this, 4, 23);
/* 282:282 */     this.Shape50.func_78789_a(-1.4F, 7.1F, -1.8F, 1, 2, 1);
/* 283:283 */     this.Shape50.func_78793_a(5.5F, 4.5F, 2.0F);
/* 284:284 */     this.Shape50.func_78787_b(128, 64);
/* 285:285 */     this.Shape50.field_78809_i = true;
/* 286:286 */     setRotation(this.Shape50, -1.570796F, 0.0F, 1.570796F);
/* 287:287 */     this.Shape51 = new ModelRenderer(this, 49, 46);
/* 288:288 */     this.Shape51.func_78789_a(-2.8F, -5.2F, -4.1F, 2, 2, 1);
/* 289:289 */     this.Shape51.func_78793_a(0.0F, -1.4F, 2.733333F);
/* 290:290 */     this.Shape51.func_78787_b(128, 64);
/* 291:291 */     this.Shape51.field_78809_i = true;
/* 292:292 */     setRotation(this.Shape51, 0.0F, 0.0F, 0.0F);
/* 293:293 */     this.Shape52 = new ModelRenderer(this, 49, 46);
/* 294:294 */     this.Shape52.func_78789_a(0.8F, -5.2F, -4.1F, 2, 2, 1);
/* 295:295 */     this.Shape52.func_78793_a(0.0F, -1.4F, 2.733333F);
/* 296:296 */     this.Shape52.func_78787_b(128, 64);
/* 297:297 */     this.Shape52.field_78809_i = true;
/* 298:298 */     setRotation(this.Shape52, 0.0F, 0.0F, 0.0F);
/* 299:299 */     this.Shape53 = new ModelRenderer(this, 71, 47);
/* 300:300 */     this.Shape53.func_78789_a(-2.0F, -4.3F, -4.2F, 1, 1, 1);
/* 301:301 */     this.Shape53.func_78793_a(0.0F, -1.4F, 2.733333F);
/* 302:302 */     this.Shape53.func_78787_b(128, 64);
/* 303:303 */     this.Shape53.field_78809_i = true;
/* 304:304 */     setRotation(this.Shape53, 0.0F, 0.0F, 0.0F);
/* 305:305 */     this.Shape54 = new ModelRenderer(this, 71, 47);
/* 306:306 */     this.Shape54.func_78789_a(1.0F, -4.3F, -4.2F, 1, 1, 1);
/* 307:307 */     this.Shape54.func_78793_a(0.0F, -1.4F, 2.733333F);
/* 308:308 */     this.Shape54.func_78787_b(128, 64);
/* 309:309 */     this.Shape54.field_78809_i = true;
/* 310:310 */     setRotation(this.Shape54, 0.0F, 0.0F, 0.0F);
/* 311:311 */     this.Shape55 = new ModelRenderer(this, 75, 58);
/* 312:312 */     this.Shape55.func_78789_a(-2.0F, 0.0F, -3.0F, 4, 1, 2);
/* 313:313 */     this.Shape55.func_78793_a(0.0F, -2.3F, -0.2666667F);
/* 314:314 */     this.Shape55.func_78787_b(128, 64);
/* 315:315 */     this.Shape55.field_78809_i = true;
/* 316:316 */     setRotation(this.Shape55, 0.0F, 0.0F, 0.0F);
/* 317:317 */     this.Shape56 = new ModelRenderer(this, 47, 58);
/* 318:318 */     this.Shape56.func_78789_a(-2.0F, -1.533333F, -3.0F, 4, 1, 2);
/* 319:319 */     this.Shape56.func_78793_a(0.0F, -2.3F, -0.2666667F);
/* 320:320 */     this.Shape56.func_78787_b(128, 64);
/* 321:321 */     this.Shape56.field_78809_i = true;
/* 322:322 */     setRotation(this.Shape56, 0.0F, 0.0F, 0.0F);
/* 323:323 */     this.Shape57 = new ModelRenderer(this, 51, 56);
/* 324:324 */     this.Shape57.func_78789_a(-1.5F, -2.0F, -2.0F, 3, 1, 1);
/* 325:325 */     this.Shape57.func_78793_a(0.0F, -2.3F, -0.2666667F);
/* 326:326 */     this.Shape57.func_78787_b(128, 64);
/* 327:327 */     this.Shape57.field_78809_i = true;
/* 328:328 */     setRotation(this.Shape57, 0.0F, 0.0F, 0.0F);
/* 329:329 */     this.Shape58 = new ModelRenderer(this, 49, 44);
/* 330:330 */     this.Shape58.func_78789_a(-1.0F, -2.466667F, -1.266667F, 2, 1, 1);
/* 331:331 */     this.Shape58.func_78793_a(0.0F, -2.3F, -0.2666667F);
/* 332:332 */     this.Shape58.func_78787_b(128, 64);
/* 333:333 */     this.Shape58.field_78809_i = true;
/* 334:334 */     setRotation(this.Shape58, 0.0F, 0.0F, 0.0F);
/* 335:335 */     this.Shape59 = new ModelRenderer(this, 76, 31);
/* 336:336 */     this.Shape59.func_78789_a(-1.466667F, 7.533333F, -1.0F, 1, 4, 4);
/* 337:337 */     this.Shape59.func_78793_a(5.5F, 4.5F, 2.0F);
/* 338:338 */     this.Shape59.func_78787_b(128, 64);
/* 339:339 */     this.Shape59.field_78809_i = true;
/* 340:340 */     setRotation(this.Shape59, -1.570796F, 0.0F, 1.570796F);
/* 341:341 */     this.Shape60 = new ModelRenderer(this, 93, 31);
/* 342:342 */     this.Shape60.func_78789_a(-5.466667F, 8.0F, -0.5333334F, 4, 3, 3);
/* 343:343 */     this.Shape60.func_78793_a(5.5F, 4.5F, 2.0F);
/* 344:344 */     this.Shape60.func_78787_b(128, 64);
/* 345:345 */     this.Shape60.field_78809_i = true;
/* 346:346 */     setRotation(this.Shape60, -1.570796F, 0.0F, 1.570796F);
/* 347:347 */     this.Shape61 = new ModelRenderer(this, 111, 31);
/* 348:348 */     this.Shape61.func_78789_a(-7.466667F, 9.0F, 0.466667F, 2, 1, 1);
/* 349:349 */     this.Shape61.func_78793_a(5.5F, 4.5F, 2.0F);
/* 350:350 */     this.Shape61.func_78787_b(128, 64);
/* 351:351 */     this.Shape61.field_78809_i = true;
/* 352:352 */     setRotation(this.Shape61, -1.570796F, 0.0F, 1.570796F);
/* 353:353 */     this.Shape62 = new ModelRenderer(this, 38, 30);
/* 354:354 */     this.Shape62.func_78789_a(-1.533333F, -0.2F, -2.9F, 3, 1, 0);
/* 355:355 */     this.Shape62.func_78793_a(0.0F, -2.3F, -0.2666667F);
/* 356:356 */     this.Shape62.func_78787_b(128, 64);
/* 357:357 */     this.Shape62.field_78809_i = true;
/* 358:358 */     setRotation(this.Shape62, 0.0F, 0.0F, 0.0F);
/* 359:    */   }
/* 360:    */   
/* 361:    */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/* 362:    */   {
/* 363:363 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/* 364:364 */     setRotationAngles(f, f1, f2, f3, f4, f5);
/* 365:365 */     this.Shape1.func_78785_a(f5);
/* 366:366 */     this.Shape2.func_78785_a(f5);
/* 367:367 */     this.Shape3.func_78785_a(f5);
/* 368:368 */     this.Shape4.func_78785_a(f5);
/* 369:369 */     this.Shape7.func_78785_a(f5);
/* 370:370 */     this.Shape8.func_78785_a(f5);
/* 371:371 */     this.Shape9.func_78785_a(f5);
/* 372:372 */     this.Shape10.func_78785_a(f5);
/* 373:373 */     this.Shape11.func_78785_a(f5);
/* 374:374 */     this.Shape12.func_78785_a(f5);
/* 375:375 */     this.Shape13.func_78785_a(f5);
/* 376:376 */     this.Shape14.func_78785_a(f5);
/* 377:377 */     this.Shape15.func_78785_a(f5);
/* 378:378 */     this.Shape18.func_78785_a(f5);
/* 379:379 */     this.Shape20.func_78785_a(f5);
/* 380:380 */     this.Shape24.func_78785_a(f5);
/* 381:381 */     this.Shape30.func_78785_a(f5);
/* 382:382 */     this.Shape31.func_78785_a(f5);
/* 383:383 */     this.Shape32.func_78785_a(f5);
/* 384:384 */     this.Shape33.func_78785_a(f5);
/* 385:385 */     this.Shape34.func_78785_a(f5);
/* 386:386 */     this.Shape35.func_78785_a(f5);
/* 387:387 */     this.Shape36.func_78785_a(f5);
/* 388:388 */     this.Shape37.func_78785_a(f5);
/* 389:389 */     this.Shape38.func_78785_a(f5);
/* 390:390 */     this.Shape39.func_78785_a(f5);
/* 391:391 */     this.Shape40.func_78785_a(f5);
/* 392:392 */     this.Shape41.func_78785_a(f5);
/* 393:393 */     this.Shape42.func_78785_a(f5);
/* 394:394 */     this.Shape43.func_78785_a(f5);
/* 395:395 */     this.Shape44.func_78785_a(f5);
/* 396:396 */     this.Shape45.func_78785_a(f5);
/* 397:397 */     this.Shape46.func_78785_a(f5);
/* 398:398 */     this.Shape47.func_78785_a(f5);
/* 399:399 */     this.Shape48.func_78785_a(f5);
/* 400:400 */     this.Shape49.func_78785_a(f5);
/* 401:401 */     this.Shape50.func_78785_a(f5);
/* 402:402 */     this.Shape51.func_78785_a(f5);
/* 403:403 */     this.Shape52.func_78785_a(f5);
/* 404:404 */     this.Shape53.func_78785_a(f5);
/* 405:405 */     this.Shape54.func_78785_a(f5);
/* 406:406 */     this.Shape55.func_78785_a(f5);
/* 407:407 */     this.Shape56.func_78785_a(f5);
/* 408:408 */     this.Shape57.func_78785_a(f5);
/* 409:409 */     this.Shape58.func_78785_a(f5);
/* 410:410 */     this.Shape59.func_78785_a(f5);
/* 411:411 */     this.Shape60.func_78785_a(f5);
/* 412:412 */     this.Shape61.func_78785_a(f5);
/* 413:413 */     this.Shape62.func_78785_a(f5);
/* 414:    */   }
/* 415:    */   
/* 416:    */   private void setRotation(ModelRenderer model, float x, float y, float z)
/* 417:    */   {
/* 418:418 */     model.field_78795_f = x;
/* 419:419 */     model.field_78796_g = y;
/* 420:420 */     model.field_78808_h = z;
/* 421:    */   }
/* 422:    */   
/* 423:    */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
/* 424:    */   {
/* 425:425 */     super.func_78087_a(f, f1, f2, f3, f4, f5, null);
/* 426:    */   }
/* 427:    */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.toychica.ToyChica
 * JD-Core Version:    0.7.1
 */